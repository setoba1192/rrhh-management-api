package com.softcaribbean.rh.domain.model;

import com.softcaribbean.rh.domain.model.estado.EntidadEstado;
import com.softcaribbean.rh.domain.model.geo.Ciudad;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "empleados")
public class Empleado implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "persona_id")
    private Persona persona;

    @Column(name = "email_corporativo")
    private String emailCorporativo;

    @Column(name = "telefono_corporativo")
    private String telefono_corporativo;

    @Column(name = "direccion_trabajo")
    private String direccion_trabajo;

    @ManyToOne
    @JoinColumn(name = "ciudad_id")
    private Ciudad ciudad_trabajo;

    @ManyToOne
    @JoinColumn(name = "cargo_id")
    private Cargo cargo;

    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;

    @ManyToOne
    @JoinColumn(name = "estado_id")
    private EntidadEstado estado;

    @Column(name = "eliminado", columnDefinition = "boolean default false")
    private boolean eliminado;

}
