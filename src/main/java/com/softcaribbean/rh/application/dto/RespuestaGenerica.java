package com.softcaribbean.rh.application.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Clase genérica para retornar respuesta de las API's
 * es obligatorio utilizar esta clase para todos los retornos
 * de cualquier controlador, puede haber excepciones para otros
 * casos de uso.
 *
 * @author Joan Roa
 */

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RespuestaGenerica {

    private String mensaje;

    private List<String> errores;

    private Object data;

}
