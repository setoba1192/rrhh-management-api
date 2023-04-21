package com.softcaribbean.rh.application.controller.administracion;


import com.softcaribbean.rh.application.dto.RespuestaGenerica;
import com.softcaribbean.rh.application.service.empresa.AreaService;
import com.softcaribbean.rh.domain.dto.empresa.AreaDto;
import com.softcaribbean.rh.infraestructure.util.ApiName;
import com.softcaribbean.rh.infraestructure.util.MensajesService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping(ApiName.AdministracionRecursos.ADMIN_RESOURCES + "/area")
public class AreaController {

    private final MensajesService mensajesService;

    private final AreaService areaService;

    @GetMapping
    public RespuestaGenerica listAll() {
        return RespuestaGenerica.builder()
                .data(areaService.findAll())
                .build();
    }

    @GetMapping("/{id}")
    public RespuestaGenerica findById(@PathVariable Long id) {
        return RespuestaGenerica.builder()
                .mensaje(mensajesService.getMensaje("area.findbyid.message"))
                .data(areaService.create(areaService.findById(id)))
                .build();
    }

    @PostMapping
    public RespuestaGenerica crearArea(@Valid @RequestBody AreaDto area) {
        return RespuestaGenerica.builder()
                .mensaje(mensajesService.getMensaje("area.crear.ok"))
                .data(areaService.create(area))
                .build();
    }
}
