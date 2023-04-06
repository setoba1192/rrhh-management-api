package com.softcaribbean.rh.domain.dto.empleado;

import com.softcaribbean.rh.domain.dto.empresa.EmpresaDto;
import com.softcaribbean.rh.domain.model.empresa.Empresa;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

/**
 * Clase que contiene información acerca del seguimiento del empleado
 * <p>
 * Por ej, cuando el manager se reune con el cliente y este da un feedback
 *
 * @author Joan Roa S.
 */

@Data
@Builder
public class SeguimientoEmpleadoDto {

    private Long id;

    private EmpleadoDto empleadoDto;

    private EmpresaDto empresa;

    /**
     * Empleado que registra el seguimiento,
     * en este caso el jefe directo del empleado
     */
    private EmpleadoDto jefeDirecto;

    /**
     * Comentario general del seguimiento
     */
    private String comentarios;

    /**
     * Aspectos a mejorar
     */
    private String aMejorar;

    /**
     * Calificación de 0 a 5 del feedback o seguimiento
     */
    @Min(0)
    @Max(5)
    private float calificacion;

    private LocalDate fechaSeguimiento;

    private boolean eliminado;
}
