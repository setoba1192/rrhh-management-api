package com.softcaribbean.rh.infraestructure.mapper;

import com.softcaribbean.rh.domain.dto.base.GeneroDto;
import com.softcaribbean.rh.domain.model.basic.Genero;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface GeneroMapper {

    Genero toEntity(GeneroDto generoDto);
}
