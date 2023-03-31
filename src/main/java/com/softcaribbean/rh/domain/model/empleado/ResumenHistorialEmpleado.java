package com.softcaribbean.rh.domain.model.empleado;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.softcaribbean.rh.domain.model.lista.Lista;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

/**
 * @author Joan Roa
 * <p>
 * Esta clase contiene información del resumen histórico laboral
 * y de educación del empleado
 */
@Data
@Builder
@Entity
@Table(name = "resumen_historial_empleado")
public class ResumenHistorialEmpleado {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "empleado_id")
    private Empleado empleado;

    @Column(name = "institucion_empresa")
    private String institucionOEmpresa;

    @Column(name = "cargo_titulo", nullable = false)
    private String cargoOTitulo;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @Column(name = "fecha_inicio", nullable = false)
    private LocalDate fechaInicio;

    @Column(name = "fecha_fin", nullable = true)
    private LocalDate fechaFin;

    /**
     * Este atributo indica el tipo de experiencia
     * Ya sea laboral o educación
     */
    @ManyToOne
    @JoinColumn(name = "tipo_id")
    private Lista tipo;


}
