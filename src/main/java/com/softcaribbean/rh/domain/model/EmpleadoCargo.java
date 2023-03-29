package com.softcaribbean.rh.domain.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "empleados_cargos")
public class EmpleadoCargo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado_cargo")
    private Long idEmpleadoCargo;

    @ManyToOne
    @JoinColumn(name = "id_empleado", referencedColumnName = "id_empleado")
    private Empleado empleado;

    @ManyToOne
    @JoinColumn(name = "id_cargo", referencedColumnName = "id_cargo")
    private Cargo cargo;

    @Column(name = "fecha_inicio")
    private String fechaInicio;

    @Column(name = "fecha_fin")
    private String fechaFin;

    // Constructores, getters y setters
}