package com.softcaribbean.rh.domain.dto.empleado;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class HabilidadDto {

    private Long id;

    private String nombre;

    private String descripcion;

    private boolean eliminado;

}
