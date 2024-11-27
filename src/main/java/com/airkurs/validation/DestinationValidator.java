package com.airkurs.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.List;

public class DestinationValidator implements ConstraintValidator<ValidDestination, String> {

    private final List<String> validDestinations = Arrays.asList("Москва", "Санкт-Петербург", "Казань");

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value != null && validDestinations.contains(value);
    }
}
