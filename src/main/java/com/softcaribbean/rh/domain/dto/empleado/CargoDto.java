package com.softcaribbean.rh.domain.dto.empleado;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class CargoDto implements Serializable {

    private Long idCargo;

    private String nombre;

    private String descripcion;

    private boolean eliminado;
}