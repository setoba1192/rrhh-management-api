package com.softcaribbean.rh.domain.dto.empleado;

import com.softcaribbean.rh.domain.model.basic.Persona;
import com.softcaribbean.rh.domain.model.estado.EntidadEstado;
import com.softcaribbean.rh.domain.model.geo.Ciudad;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;


@Data
@Builder
public class EmpleadoDto implements Serializable {

    private Long id;

    private Persona persona;

    private LocalDate fechaContratacion;

    private String emailCorporativo;

    private String telefono_corporativo;

    private String direccion_trabajo;

    private Ciudad ciudad_trabajo;

    /**
     * Url del documento de la Hoja de Vida
     */
    private String hojaVidaURL;

    private EntidadEstado estado;

    private boolean eliminado;

}
