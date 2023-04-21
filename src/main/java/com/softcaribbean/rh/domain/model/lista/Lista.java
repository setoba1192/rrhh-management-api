package com.softcaribbean.rh.domain.model.lista;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

/**
 * Tabla que contiene el tipo de lista
 * <p>
 * Aquí se parametriza las listas genéricas para
 * las diferentes entidades
 *
 * @author Joan Roa S.
 */

@Data
@Builder
@Entity
@Table(name = "lista")
public class Lista {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "identificador", nullable = false)
    private String nombre;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    /**
     * Indica que tabla se va referenciar
     */
    @JsonIgnore
    @Column(name = "tabla_referencia", nullable = false)
    private String tablaReferencia;

    @Column(name = "eliminado", columnDefinition = "boolean default false")
    private boolean eliminado;

}
