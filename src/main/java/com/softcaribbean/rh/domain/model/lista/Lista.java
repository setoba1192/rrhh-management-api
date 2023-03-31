package com.softcaribbean.rh.domain.model.lista;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

/**
 * @author Joan Roa
 *
 * Esta tabla contiene las listas de acuerdo a la entidad
 *
 */

@Data
@Builder
@Entity
@Table(name = "listas")
public class Lista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "tipo_lista_id")
    private TipoLista tipoLista;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "descripcion", nullable = true)
    private String descripcion;

    @Column(name = "eliminado", columnDefinition = "boolean default false")
    private boolean eliminado;

}
