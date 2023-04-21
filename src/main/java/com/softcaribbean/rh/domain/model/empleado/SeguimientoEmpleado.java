package com.softcaribbean.rh.domain.model.empleado;

import com.softcaribbean.rh.domain.model.empresa.Empresa;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

/**
 * Clase que contiene información acerca del seguimiento del empleado
 *
 * Por ej, cuando el manager se reune con el cliente y este da un feedback
 *
 * @author Joan Roa S.
 */

@Data
@Builder
@Entity
@Table(name = "seguimiento_empleados")
public class SeguimientoEmpleado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "empleado_id")
    private Empleado empleado;

    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;

    /**
     * Empleado que registra el seguimiento,
     * en este caso el jefe directo del empleado
     */
    @ManyToOne
    @JoinColumn(name = "jefe_directo_id")
    private Empleado jefeDirecto;

    /**
     * Comentario general del seguimiento
     */
    @Column(name = "comentarios", nullable = false)
    private String comentarios;

    /**
     * Aspectos a mejorar
     */
    @Column(name = "aspectos_mejorar", nullable = true)
    private String aMejorar;

    /**
     * Calificación de 0 a 5 del feedback o seguimiento
     */
    @Min(0)
    @Max(5)
    @Column(name = "calificación", nullable = false)
    private float calificacion;

    @Column(name = "fecha_seguimiento", nullable = false)
    private LocalDate fechaSeguimiento;

    @Column(name = "eliminado", columnDefinition = "boolean default false")
    private boolean eliminado;


}
