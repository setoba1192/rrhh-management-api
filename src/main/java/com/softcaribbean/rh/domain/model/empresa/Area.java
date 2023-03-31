package com.softcaribbean.rh.domain.model.empresa;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * Areas dentro de la compañia
 * Ej: Desarrollo de Software, Recursos Humanos, Ingeniería, Administración
 *
 * @author Joan Roa
 */

@Data
@Builder
@Entity
@Table(name = "areas")
public class Area implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "eliminado", columnDefinition = "boolean default false")
    private boolean eliminado;

}
