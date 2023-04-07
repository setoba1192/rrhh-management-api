package com.softcaribbean.rh.application.controller.administracion;

import com.softcaribbean.rh.application.service.basic.PersonaService;
import com.softcaribbean.rh.domain.dto.base.PersonaDto;
import com.softcaribbean.rh.infraestructure.util.ApiName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ApiName.AdministracionRecursos.ADMIN_RESOURCES + "/empresa")
public class EmpresaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping
    public PersonaDto test() {
        return personaService.findById(1L);
    }


}
