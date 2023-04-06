package com.softcaribbean.rh.domain.dto.lista;

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
public class ListaDto {

    private Long id;

    private String nombre;

    private String descripcion;

    /**
     * Indica que tabla se va referenciar
     */
    private String tablaReferencia;

    private boolean eliminado;

}
