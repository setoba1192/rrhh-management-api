package com.softcaribbean.rh.domain.dto.estado;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @JsonIgnore
    private transient String descripcion;

    @JsonIgnore
    private transient String tabla;
}
