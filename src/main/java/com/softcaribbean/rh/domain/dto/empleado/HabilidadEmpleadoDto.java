package com.softcaribbean.rh.domain.dto.empleado;

import com.softcaribbean.rh.domain.dto.lista.ListaElementoDto;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class HabilidadEmpleadoDto implements Serializable {

    private Long id;

    private HabilidadDto habilidadDto;

    private EmpleadoDto empleadoDto;

    /**
     * Indica el nivel en el que está su habilidad
     * Este elemento tiene como valor un tipo de dato en porcentaje
     * que va de 0 a 100
     */
    private ListaElementoDto nivel;

    private boolean eliminado;

}
