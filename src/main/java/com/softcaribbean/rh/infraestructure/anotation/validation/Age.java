package com.softcaribbean.rh.infraestructure.anotation.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = AgeValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Age {

    String message() default "La edad debe ser mayor o igual a {value} años";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    int value();
}