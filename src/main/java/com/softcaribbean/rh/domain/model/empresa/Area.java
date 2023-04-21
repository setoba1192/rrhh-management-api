package com.softcaribbean.rh.domain.model.empresa;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Areas dentro de la compañia
 * Ej: Desarrollo de Software, Recursos Humanos, Ingeniería, Administración
 *
 * @author Joan Roa
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "areas")
public class Area implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "eliminado", columnDefinition = "boolean default false")
    private boolean eliminado;

}
