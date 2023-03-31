package com.softcaribbean.rh.domain.model.estado;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
@Entity
@Table(name = "estados_tablas")
public class EntidadEstado implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @Column(name = "tabla", nullable = false)
    private String tabla;
}
