package com.softcaribbean.rh.application.controller.administracion;

import com.softcaribbean.rh.application.dto.RespuestaGenerica;
import com.softcaribbean.rh.application.service.basic.PersonaService;
import com.softcaribbean.rh.domain.dto.base.PersonaDto;
import com.softcaribbean.rh.infraestructure.util.ApiName;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(ApiName.AdministracionPersona.ADMIN_PERSONAS)
public class PersonaController {

    private final PersonaService personaService;

    @PostMapping
    public ResponseEntity<RespuestaGenerica> crear(@Valid @RequestBody PersonaDto personaDto) {

        return new ResponseEntity<>(RespuestaGenerica.builder()
                .data(personaService.create(personaDto))
                .build(), HttpStatus.CREATED);
    }

}
