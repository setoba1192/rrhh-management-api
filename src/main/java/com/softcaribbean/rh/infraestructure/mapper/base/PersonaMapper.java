package com.softcaribbean.rh.infraestructure.mapper.base;

import com.softcaribbean.rh.domain.dto.base.GeneroDto;
import com.softcaribbean.rh.domain.dto.base.PersonaDto;
import com.softcaribbean.rh.domain.model.basic.Genero;
import com.softcaribbean.rh.domain.model.basic.Persona;
import com.softcaribbean.rh.infraestructure.mapper.empleado.EntidadEstadoMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface PersonaMapper extends EntidadEstadoMapper, GeneroMapper{

    PersonaMapper INSTANCE = Mappers.getMapper(PersonaMapper.class);

    Persona toEntity(PersonaDto personaDto);

    PersonaDto toDto(Persona persona);

}
