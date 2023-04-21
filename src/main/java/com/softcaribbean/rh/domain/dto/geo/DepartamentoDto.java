package com.softcaribbean.rh.domain.dto.geo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class DepartamentoDto {

    private Long id;

    private String nombre;

    private PaisDto paisDto;

}