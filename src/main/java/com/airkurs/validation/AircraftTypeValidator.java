package com.airkurs.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.List;

public class AircraftTypeValidator implements ConstraintValidator<ValidAircraftType, String> {

    private final List<String> validAircraftTypes = Arrays.asList("Boeing 737", "Airbus A320", "Embraer E190",
            "Bombardier CRJ-900", "Cessna 172", "Boeing 747-8", "Airbus A350", "Boeing 777", "Gulfstream G650",
            "Dassault Falcon 7X", "Boeing 767", "Airbus A310", "Bombardier Q400", "Cessna Citation X", "Piper PA-28",
            "Antonov An-124", "Sukhoi Superjet 100", "Tupolev Tu-204", "Ilyushin Il-96", "Mitsubishi MRJ", "Boeing 757",
            "Airbus A319", "Airbus A380");

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        System.out.println(value);
        System.out.println(validAircraftTypes.get(0));
        return value != null && validAircraftTypes.contains(value);
    }
}