package com.softcaribbean.rh.domain.model.estado;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Esta clase representa los estados de los diferentes estados
 * Ej: Una Persona podría tener cualquiera de los siguientes estados => Activo, Retirado, Inhabilitado
 *
 * @tabla = Para indicar a la tabla que pertenece el estado
 *
 * @author Joan Roa
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "estados_tablas")
public class EntidadEstado implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @Column(name = "tabla", nullable = false)
    private String tabla;
}
