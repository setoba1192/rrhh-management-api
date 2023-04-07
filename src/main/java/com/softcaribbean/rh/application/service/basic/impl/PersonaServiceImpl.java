package com.softcaribbean.rh.application.service.basic.impl;

import com.softcaribbean.rh.application.exception.ResourceNotFoundException;
import com.softcaribbean.rh.application.service.basic.CrudBaseService;
import com.softcaribbean.rh.application.service.basic.PersonaService;
import com.softcaribbean.rh.domain.dto.base.PersonaDto;
import com.softcaribbean.rh.infraestructure.mapper.base.PersonaMapper;
import com.softcaribbean.rh.infraestructure.repository.basic.PersonaRepository;
import com.softcaribbean.rh.infraestructure.util.MensajeValidacionService;
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
    private MensajeValidacionService mensajeValidacionService;

    @Override
    public PersonaDto findById(Long id) {
        return personaMapper.toDto(personaRepository.findById(id).orElseThrow(() -> {
            throw new ResourceNotFoundException(mensajeValidacionService.getValidationMessage("global.resource.notfound"));
        }));
    }

    @Override
    public List<PersonaDto> findAll() {
        return null;
    }

    @Override
    public PersonaDto create(PersonaDto dto) {
        return null;
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
