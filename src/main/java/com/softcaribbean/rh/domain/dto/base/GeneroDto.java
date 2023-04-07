package com.softcaribbean.rh.domain.dto.base;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GeneroDto implements Serializable {

    private Long id;

    private String nombre;

}
