package com.softcaribbean.rh.infraestructure.mapper.base;

import com.softcaribbean.rh.domain.dto.base.GeneroDto;
import com.softcaribbean.rh.domain.model.basic.Genero;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface GeneroMapper {

    GeneroMapper INSTANCE = Mappers.getMapper(GeneroMapper.class);

    Genero toEntity(GeneroDto generoDto);
}
