package com.softcaribbean.rh.domain.dto.lista;

import lombok.Builder;
import lombok.Data;

/**
 * Esta tabla contiene las listas de acuerdo a la entidad
 *
 * @author Joan Roa S.
 */

@Data
@Builder
public class ListaElementoDto {

    private Long id;

    private ListaDto listaDto;

    private String nombre;

    private String descripcion;

    /**
     * Opcional
     * <p>
     * Atributo para almacenar valores extra
     */
    private String valor;

    private boolean eliminado;

}
