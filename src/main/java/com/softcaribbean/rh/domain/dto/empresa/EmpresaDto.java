package com.softcaribbean.rh.domain.dto.empresa;

import com.softcaribbean.rh.domain.model.geo.Ciudad;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class EmpresaDto implements Serializable {

    private Long id;

    private String nombre;

    private String direccionPrincipal;

    private String direccionSecundaria;

    private Ciudad ciudad;

    private String telefono;

    private String email;

    private String website;

    private String logoUrl;

    private boolean eliminado;

}
