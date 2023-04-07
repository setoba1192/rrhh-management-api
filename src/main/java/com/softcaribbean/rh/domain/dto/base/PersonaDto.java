package com.softcaribbean.rh.domain.dto.base;

import com.softcaribbean.rh.domain.dto.estado.EntidadEstadoDto;
import com.softcaribbean.rh.domain.dto.geo.CiudadDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonaDto implements Serializable {

    private Long id;

    private String nombre;

    private String apellido;

    private LocalDate fechaNacimiento;

    private GeneroDto genero;

    private String email;

    private String telefono;

    private String direccion;

    private CiudadDto ciudad;

    private String fotoUrl;

    private EntidadEstadoDto estado;

    private boolean eliminado;

}
