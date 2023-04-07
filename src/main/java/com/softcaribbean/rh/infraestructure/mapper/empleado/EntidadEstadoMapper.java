package com.softcaribbean.rh.infraestructure.mapper.empleado;

import com.softcaribbean.rh.domain.dto.estado.EntidadEstadoDto;
import com.softcaribbean.rh.domain.model.estado.EntidadEstado;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface EntidadEstadoMapper {

    EntidadEstadoMapper INSTANCE = Mappers.getMapper(EntidadEstadoMapper.class);

    EntidadEstado toEntity(EntidadEstadoDto entidadEstadoDto);

    EntidadEstadoDto toDto(EntidadEstado entidadEstado);
}
