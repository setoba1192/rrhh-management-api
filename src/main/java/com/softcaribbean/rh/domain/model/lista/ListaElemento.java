package com.softcaribbean.rh.domain.model.lista;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

/**
 * @author Joan Roa
 * <p>
 * Esta tabla contiene las listas de acuerdo a la entidad
 */

@Data
@Builder
@Entity
@Table(name = "lista_elementos")
public class ListaElemento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "lista_id")
    private Lista lista;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    /**
     * Opcional
     * <p>
     * Atributo para almacenar valores extra
     */
    @Column(name = "valor")
    private String valor;

    @Column(name = "eliminado", columnDefinition = "boolean default false")
    private boolean eliminado;

}
