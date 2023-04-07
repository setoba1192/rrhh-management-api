package com.softcaribbean.rh.application.controller.administracion;

import com.softcaribbean.rh.application.dto.RespuestaGenerica;
import com.softcaribbean.rh.application.exception.ResourceNotFoundException;
import com.softcaribbean.rh.application.exception.ServiceException;
import com.softcaribbean.rh.infraestructure.util.MensajeValidacionService;
import jakarta.validation.ConstraintViolationException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

@RestControllerAdvice
@RequiredArgsConstructor
public class ControllerExceptionHandler {

    private final MensajeValidacionService mensajeValidacionService;

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ConstraintViolationException.class)
    public RespuestaGenerica constraintsValidationHandler(ConstraintViolationException e) {

        List<String> errors = e.getConstraintViolations().stream()
                .map(constraintViolation -> constraintViolation.getMessage()).toList();

        return RespuestaGenerica.builder()
                .mensaje(mensajeValidacionService.getValidationMessage("global.error.found"))
                .errores(errors)
                .build();
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public RespuestaGenerica methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e) {

        List<String> errors = e.getBindingResult().getFieldErrors().stream()
                .map(error -> error.getDefaultMessage()).toList();

        return RespuestaGenerica.builder()
                .mensaje(mensajeValidacionService.getValidationMessage("global.error.found"))
                .errores(errors)
                .build();
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ServiceException.class)
    public RespuestaGenerica serviceExceptionHandler(ServiceException e) {
        return RespuestaGenerica.builder()
                .mensaje(e.getMessage())
                .build();
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(ResourceNotFoundException.class)
    public RespuestaGenerica resourceNotFoundException(ResourceNotFoundException e) {
        return RespuestaGenerica.builder()
                .mensaje(e.getMessage())
                .build();
    }


}
