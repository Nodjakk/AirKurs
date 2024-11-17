package com.airkurs;

public class Flight {
    private String destination;
    private String number;
    private String aircraftType;

    public Flight(String destination, String flightNumber, String aircraftType) {
        this.destination = destination;
        this.number = flightNumber;
        this.aircraftType = aircraftType;
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
