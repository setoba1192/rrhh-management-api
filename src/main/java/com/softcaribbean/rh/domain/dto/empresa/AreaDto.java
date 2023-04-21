package com.softcaribbean.rh.domain.dto.empresa;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Areas dentro de la compañia
 * Ej: Desarrollo de Software, Recursos Humanos, Ingeniería, Administración
 *
 * @author Joan Roa
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AreaDto implements Serializable {

    private Long id;

    @Size(min = 2, message = "{area.nombre.minlength}")
    @Size(max = 40, message = "{area.nombre.maxlength}")
    private String nombre;

    private boolean eliminado;

}
