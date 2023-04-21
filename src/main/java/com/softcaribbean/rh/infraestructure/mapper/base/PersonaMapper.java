package com.softcaribbean.rh.infraestructure.mapper.base;

import com.softcaribbean.rh.domain.dto.base.PersonaDto;
import com.softcaribbean.rh.domain.model.basic.Persona;
import com.softcaribbean.rh.infraestructure.mapper.estado.EntidadEstadoMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface PersonaMapper extends EntidadEstadoMapper, GeneroMapper{

    PersonaMapper INSTANCE = Mappers.getMapper(PersonaMapper.class);

    Persona toEntity(PersonaDto personaDto);

    PersonaDto toDto(Persona persona);

}
