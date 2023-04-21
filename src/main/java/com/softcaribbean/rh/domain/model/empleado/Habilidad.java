package com.softcaribbean.rh.domain.model.empleado;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
@Entity
@Table(name = "habilidades")
public class Habilidad {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "descripcion", nullable = true)
    private String descripcion;

    @Column(name = "eliminado", columnDefinition = "boolean default false")
    private boolean eliminado;

}
