package com.softcaribbean.rh.application.service.basic.impl;

import com.softcaribbean.rh.application.exception.ResourceNotFoundException;
import com.softcaribbean.rh.application.exception.ServiceException;
import com.softcaribbean.rh.application.service.basic.PersonaService;
import com.softcaribbean.rh.domain.dto.base.PersonaDto;
import com.softcaribbean.rh.domain.model.basic.Persona;
import com.softcaribbean.rh.infraestructure.mapper.base.PersonaMapper;
import com.softcaribbean.rh.infraestructure.repository.basic.PersonaRepository;
import com.softcaribbean.rh.infraestructure.util.MensajesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Autowired
    private PersonaMapper personaMapper;

    @Autowired
    private MensajesService mensajesService;

    @Override
    public PersonaDto findById(Long id) {
        return personaMapper.toDto(personaRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(mensajesService.getMensaje("global.resource.notfound"))));
    }

    @Override
    public List<PersonaDto> findAll() {
        return null;
    }

    @Override
    public PersonaDto create(PersonaDto personaDto) {

        /**
         * Obligar el id en null dado que solo se registra
         * en este metodo
         */
        personaDto.setId(null);
        Persona personaSaved = personaRepository.save(this.personaMapper.toEntity(personaDto));
        personaDto.setId(personaSaved.getId());
        return personaDto;
    }

    @Override
    public PersonaDto update(PersonaDto personaDto) {

        if (Optional.ofNullable(personaDto.getId()).isEmpty())
            throw new ServiceException(mensajesService.getMensaje("persona.registro.no.encontrado")
                    .replace("#id", personaDto.getId().toString()));

        if (personaRepository.findById(personaDto.getId()).isEmpty())
            throw new ResourceNotFoundException(mensajesService.getMensaje("persona.registro.no.encontrado")
                    .replace("#id", personaDto.getId().toString()));

        personaRepository.save(this.personaMapper.toEntity(personaDto));
        return personaDto;
    }

    @Override
    public PersonaDto deleteById(Long aLong) {
        return null;
    }
}
