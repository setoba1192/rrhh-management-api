package com.softcaribbean.rh.domain.model.lista;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

/**
 * @author Joan Roa
 * <p>
 * Tabla que contiene el tipo de lista
 * <p>
 * Aquí se parametriza las listas genéricas para
 * las diferentes entidades
 */

@Data
@Builder
@Entity
@Table(name = "tipos_listas")
public class TipoLista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
