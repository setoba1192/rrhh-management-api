package com.softcaribbean.rh.domain.model.empleado;

import com.softcaribbean.rh.domain.model.lista.ListaElemento;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
@Entity
@Table(name = "empleados_habilidades")
public class HabilidadEmpleado implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "habilidad_id")
    private Habilidad habilidad;

    @ManyToOne
    @JoinColumn(name = "empleado_id")
    private Empleado empleado;

    /**
     * Indica el nivel en el que está su habilidad
     * Este elemento tiene como valor un tipo de dato en porcentaje
     * que va de 0 a 100
     */
    @ManyToOne
    @JoinColumn(name = "nivel_id")
    private ListaElemento nivel;

    @Column(name = "eliminado", columnDefinition = "boolean default false")
    private boolean eliminado;

}
