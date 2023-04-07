package com.softcaribbean.rh.infraestructure.mapper;

import com.softcaribbean.rh.domain.dto.base.GeneroDto;
import com.softcaribbean.rh.domain.dto.base.PersonaDto;
import com.softcaribbean.rh.domain.dto.geo.CiudadDto;
import com.softcaribbean.rh.domain.model.basic.Persona;
import com.softcaribbean.rh.infraestructure.mapper.base.PersonaMapper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonaMapperTest {

    @Test
    public void givenPersonaDto_whenMapsToEntity_returnPersona() {

        PersonaMapper personaMapper = PersonaMapper.INSTANCE;

        PersonaDto personaDto = PersonaDto
                .builder()
                .id(1L)
                .nombre("Joan")
                .apellido("Roa")
                .direccion("Calle 41 sur 33 - 178")
                .build();

        Persona persona = personaMapper.toEntity(personaDto);

        assertThat(persona.getId()).isEqualTo(personaDto.getId());
        assertThat(persona.getNombre()).isEqualTo(personaDto.getNombre());

    }

    @Test
    public void givenPersonaDtoWithChildGeneroDto_whenMapsToEntity_returnPersonaWithGenero() {

        PersonaMapper personaMapper = PersonaMapper.INSTANCE;

        GeneroDto generoDto = new GeneroDto();
        generoDto.setId(1L);
        generoDto.setNombre("Masculino");

        PersonaDto personaDto = PersonaDto
                .builder()
                .id(1L)
                .nombre("Joan")
                .apellido("Roa")
                .genero(generoDto)
                .direccion("Calle 41 sur 33 - 178")
                .build();

        Persona persona = personaMapper.toEntity(personaDto);

        assertThat(generoDto.getId()).isEqualTo(persona.getGenero().getId());
        assertThat(generoDto.getNombre()).isEqualTo(persona.getGenero().getNombre());

    }

    @Test
    public void givenPersonaDtoWithChildCiudadDto_whenMapsToEntity_returnPersonaWithCiudad() {

        PersonaMapper personaMapper = PersonaMapper.INSTANCE;

        CiudadDto ciudadDto = new CiudadDto();
        ciudadDto.setId(1L);
        ciudadDto.setNombre("Neiva");

        PersonaDto personaDto = PersonaDto
                .builder()
                .id(1L)
                .nombre("Joan")
                .apellido("Roa")
                .ciudad(ciudadDto)
                .direccion("Calle 41 sur 33 - 178")
                .build();

        Persona persona = personaMapper.toEntity(personaDto);

        assertThat(ciudadDto.getId()).isEqualTo(persona.getCiudad().getId());
        assertThat(ciudadDto.getNombre()).isEqualTo(persona.getCiudad().getNombre());

    }


}
