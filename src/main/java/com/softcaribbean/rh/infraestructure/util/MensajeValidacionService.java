package com.softcaribbean.rh.infraestructure.util;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
@RequiredArgsConstructor
public class MensajeValidacionService {

    private final MessageSource messageSource;

    public String getValidationMessage(String mensajeHash) {

        return messageSource.getMessage(mensajeHash, null, Locale.getDefault());
    }
}
