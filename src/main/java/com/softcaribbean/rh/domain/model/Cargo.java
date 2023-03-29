package com.softcaribbean.rh.domain.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "cargos")
public class Cargo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cargo")
    private Long idCargo;

    @Column(name = "nombre_cargo")
    private String nombreCargo;

    @Column(name = "descripcion")
    private String descripcion;

    // Constructores, getters y setters
}