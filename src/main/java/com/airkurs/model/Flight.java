package com.airkurs.model;

import com.airkurs.validation.ValidAircraftType;
import com.airkurs.validation.ValidDestination;
import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "flights")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Pattern(regexp = "[A-Z]{2,3}-\\d{2,4}", message = "Номер рейса должен соответствовать формату XX-1234 или XXX-123")
    @Column(name = "number", nullable = false)
    private String number;

    @ValidDestination(message = "Недопустимый пункт назначения")
    @Column(name = "destination", nullable = false)
    private String destination;

    @ValidAircraftType(message = "Недопустимый тип самолёта")
    @Column(name = "aircraft_type", nullable = false)
    private String aircraftType;

    public Flight() {}

    public Flight(String destination, String flightNumber, String aircraftType) {
        this.destination = destination;
        this.number = flightNumber;
        this.aircraftType = aircraftType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }
}
