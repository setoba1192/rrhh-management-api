package com.softcaribbean.rh.domain.model.empleado;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.softcaribbean.rh.domain.model.empresa.Area;
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "empleado_id", nullable = false)
    private Empleado empleado;

    @Column(name ="salario")
    private BigDecimal salario;

    @ManyToOne
    @JoinColumn(name = "cargo_id", nullable = false)
    private Cargo cargo;

    @ManyToOne
    @JoinColumn(name = "empresa_id", nullable = false)
    private Empresa empresa;

    @ManyToOne
    @JoinColumn(name = "area_id", nullable = false)
    private Area area;

    @Column(name = "fecha_inicio", nullable = false)
    private LocalDate fechaInicio;

}
