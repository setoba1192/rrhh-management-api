package com.softcaribbean.rh.domain.dto.geo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DepartamentoDto {

    private Long id;

    private String nombre;

    private PaisDto paisDto;

}