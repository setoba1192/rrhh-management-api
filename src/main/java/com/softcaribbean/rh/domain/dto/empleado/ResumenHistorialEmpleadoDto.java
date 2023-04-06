package com.softcaribbean.rh.domain.dto.empleado;


import com.softcaribbean.rh.domain.dto.lista.ListaElementoDto;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

/**
 * Esta clase contiene información del resumen histórico laboral
 * y de educación del empleado
 *
 * @author Joan Roa S.
 */
@Data
@Builder
public class ResumenHistorialEmpleadoDto {

    private Long id;

    private EmpleadoDto empleadoDto;

    private String institucionOEmpresa;

    private String cargoOTitulo;

    private String descripcion;

    private LocalDate fechaInicio;

    private LocalDate fechaFin;

    /**
     * Este atributo indica el tipo de experiencia
     * Ya sea laboral o educación
     */
    private ListaElementoDto tipo;


}
