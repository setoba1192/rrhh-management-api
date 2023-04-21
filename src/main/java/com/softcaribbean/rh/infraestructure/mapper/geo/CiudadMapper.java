package com.softcaribbean.rh.infraestructure.mapper.geo;

import com.softcaribbean.rh.domain.dto.base.GeneroDto;
import com.softcaribbean.rh.domain.dto.geo.CiudadDto;
import com.softcaribbean.rh.domain.model.basic.Genero;
import com.softcaribbean.rh.domain.model.geo.Ciudad;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CiudadMapper {

    CiudadMapper INSTANCE = Mappers.getMapper(CiudadMapper.class);

    Ciudad toEntity(CiudadDto ciudad);

    CiudadDto toDto(Ciudad ciudad);
}
