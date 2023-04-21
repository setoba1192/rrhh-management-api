package com.softcaribbean.rh.application.service.basic.impl;

import com.softcaribbean.rh.application.exception.ResourceNotFoundException;
import com.softcaribbean.rh.application.service.basic.PersonaService;
import com.softcaribbean.rh.domain.dto.base.PersonaDto;
import com.softcaribbean.rh.domain.model.basic.Persona;
import com.softcaribbean.rh.infraestructure.mapper.base.PersonaMapper;
import com.softcaribbean.rh.infraestructure.repository.basic.PersonaRepository;
import com.softcaribbean.rh.infraestructure.util.MensajesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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


        Persona persona = this.personaMapper.toEntity(personaDto);

        Persona personaSaved  = personaRepository.save(persona);
        personaDto.setId(personaSaved.getId());
        return personaDto;
    }

    @Override
    public PersonaDto update(PersonaDto dto) {
        return null;
    }

    @Override
    public PersonaDto deleteById(Long aLong) {
        return null;
    }
}
