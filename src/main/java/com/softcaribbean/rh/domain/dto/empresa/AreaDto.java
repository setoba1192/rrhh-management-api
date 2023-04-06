package com.softcaribbean.rh.domain.dto.empresa;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * Areas dentro de la compañia
 * Ej: Desarrollo de Software, Recursos Humanos, Ingeniería, Administración
 *
 * @author Joan Roa
 */

@Data
@Builder
public class AreaDto implements Serializable {

    private Long id;

    private String nombre;

    private boolean eliminado;

}
