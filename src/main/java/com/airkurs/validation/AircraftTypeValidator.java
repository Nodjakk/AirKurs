package com.airkurs.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.List;

public class AircraftTypeValidator implements ConstraintValidator<ValidAircraftType, String> {

    private final List<String> validAircraftTypes = Arrays.asList("Boeing 737", "Airbus A320", "Sukhoi Superjet");

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        System.out.println(value);
        System.out.println(validAircraftTypes.get(0));
        return value != null && validAircraftTypes.contains(value);
    }
}