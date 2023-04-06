package com.softcaribbean.rh.domain.dto.base;

import com.softcaribbean.rh.domain.model.estado.EntidadEstado;
import com.softcaribbean.rh.domain.model.geo.Ciudad;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@Builder
public class PersonaDto implements Serializable {

    private Long id;

    private String nombre;

    private String apellido;

    private LocalDate fechaNacimiento;

    private GeneroDto generoDto;

    private String email;

    private String telefono;

    private String direccion;

    private Ciudad ciudad;

    private String fotoUrl;

    private EntidadEstado estado;

    private boolean eliminado;

}
