package com.bolsaideas.springboot.springboot.form.app.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.util.StringUtils;


public class RequeridoValidador implements ConstraintValidator<Requerido, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        if (value == null || !StringUtils.hasText(value)) {
            return false;
        }
        return true;
    }
}
