package com.softcaribbean.rh.domain.model.empleado;

import com.softcaribbean.rh.domain.model.Persona;
import com.softcaribbean.rh.domain.model.estado.EntidadEstado;
import com.softcaribbean.rh.domain.model.geo.Ciudad;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "empleados")
public class Empleado implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "persona_id", nullable = false)
    private Persona persona;

    @Column(name = "fecha_contratacion", nullable = false)
    private LocalDate fechaContratacion;

    @Column(name = "email_corporativo", nullable = false)
    private String emailCorporativo;

    @Column(name = "telefono_corporativo", nullable = false)
    private String telefono_corporativo;

    @Column(name = "direccion_trabajo", nullable = false)
    private String direccion_trabajo;

    @ManyToOne
    @JoinColumn(name = "ciudad_id", nullable = false)
    private Ciudad ciudad_trabajo;

    /**
     * Url del documento de la Hoja de Vida
     */
    @Column(name = "hoja_vida_url")
    private String hojaVidaURL;

    @ManyToOne
    @JoinColumn(name = "estado_id", nullable = false)
    private EntidadEstado estado;

    @Column(name = "eliminado", columnDefinition = "boolean default false")
    private boolean eliminado;

}
