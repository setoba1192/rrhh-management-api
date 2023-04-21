package com.softcaribbean.rh.domain.model.empresa;

import com.softcaribbean.rh.domain.model.geo.Ciudad;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
@Entity
@Table(name = "empresas")
public class Empresa implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "direccion_principal")
    private String direccionPrincipal;

    @Column(name = "direccion_secundaria")
    private String direccionSecundaria;

    @ManyToOne
    @JoinColumn(name = "ciudad_id")
    private Ciudad ciudad;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "email")
    private String email;

    @Column(name = "website")
    private String website;

    @Column(name = "logo_url")
    private String logoUrl;

    @Column(name = "eliminado", columnDefinition = "boolean default false")
    private boolean eliminado;

}
