package com.softcaribbean.rh.domain.model.empleado;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.softcaribbean.rh.domain.model.empresa.Empresa;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
@Entity
@Table(name = "informacion_laboral_empleado")
public class InformacionLaboralEmpleado implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "empleado_id")
    private Empleado empleado;

    @Column(name ="salario")
    private BigDecimal salario;

    @ManyToOne
    @JoinColumn(name = "cargo_id")
    private Cargo cargo;

    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;

    @Column(name = "fecha_inicio")
    private LocalDate fechaInicio;

}
