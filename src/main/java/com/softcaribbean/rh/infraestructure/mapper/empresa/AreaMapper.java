package com.softcaribbean.rh.infraestructure.mapper.empresa;

import com.softcaribbean.rh.domain.dto.empresa.AreaDto;
import com.softcaribbean.rh.domain.dto.estado.EntidadEstadoDto;
import com.softcaribbean.rh.domain.model.empresa.Area;
import com.softcaribbean.rh.domain.model.estado.EntidadEstado;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface AreaMapper {

    AreaMapper INSTANCE = Mappers.getMapper(AreaMapper.class);

    Area toEntity(AreaDto areaDto);

    AreaDto toDto(Area area);
}
