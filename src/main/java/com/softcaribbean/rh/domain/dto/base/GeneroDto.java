package com.softcaribbean.rh.domain.dto.base;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class GeneroDto implements Serializable {

    private Long id;

    private String nombre;

}
