package com.softcaribbean.rh.application.controller.administracion;

import com.softcaribbean.rh.application.dto.RespuestaGenerica;
import com.softcaribbean.rh.application.service.basic.PersonaService;
import com.softcaribbean.rh.domain.dto.base.PersonaDto;
import com.softcaribbean.rh.infraestructure.util.ApiName;
import com.softcaribbean.rh.infraestructure.util.MensajesService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(ApiName.AdministracionPersona.ADMIN_PERSONAS)
public class PersonaController {

    private final PersonaService personaService;

    private final MensajesService mensajesService;

    @PostMapping
    public ResponseEntity<RespuestaGenerica> crear(@Valid @RequestBody PersonaDto personaDto) {

        return new ResponseEntity<>(RespuestaGenerica.builder()
                .data(personaService.create(personaDto))
                .mensaje(mensajesService.getMensaje("persona.crear.correcto"))
                .build(), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RespuestaGenerica> consultarPorId(@PathVariable Long id) {

        return ResponseEntity.ok(RespuestaGenerica.builder()
                .data(personaService.findById(id))
                .build());
    }

    @PutMapping
    public ResponseEntity<RespuestaGenerica> actualizar(@Valid @RequestBody PersonaDto personaDto) {

        return new ResponseEntity<>(RespuestaGenerica.builder()
                .data(personaService.update(personaDto))
                .mensaje(mensajesService.getMensaje("persona.actualizar.correcto"))
                .build(), HttpStatus.CREATED);
    }
}
