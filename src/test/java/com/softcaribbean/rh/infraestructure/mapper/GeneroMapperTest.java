package com.softcaribbean.rh.infraestructure.mapper;


import com.softcaribbean.rh.domain.dto.base.GeneroDto;
import com.softcaribbean.rh.domain.model.basic.Genero;
import com.softcaribbean.rh.infraestructure.mapper.base.GeneroMapper;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class GeneroMapperTest {

    @Test
    public void givenGeneroDto_whenMapsToEntity_returnGenero(){

        GeneroMapper  generoMapper = GeneroMapper.INSTANCE;

        GeneroDto generoDto = new GeneroDto();
        generoDto.setId(1L);
        generoDto.setNombre("Masculino");

        Genero genero = generoMapper.toEntity(generoDto);

        assertThat(genero.getId()).isEqualTo(generoDto.getId());
        assertThat(genero.getNombre()).isEqualTo(generoDto.getNombre());

    }

}
