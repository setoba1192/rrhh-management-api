package com.softcaribbean.rh.domain.dto.estado;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class EntidadEstadoDto implements Serializable {

    private Long id;

    private String nombre;

    private String descripcion;

    private String tabla;
}
