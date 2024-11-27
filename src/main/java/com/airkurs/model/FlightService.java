package com.airkurs.model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FlightService {

    private final FlightDAO flightDAO;

    public FlightService(FlightDAO flightDAO) {
        this.flightDAO = flightDAO;
    }

    public void addFlight(String number, String destination, String aircraftType) {
        Flight flight = new Flight(number, destination, aircraftType);
        flightDAO.save(flight);
    }

    public void addFlight(Flight flight) {
        flightDAO.save(flight);
    }

    public List<Flight> getFlightsByDestination(String destination) {
        List<Flight> flights = getAllFlights();
        List<Flight> filteredFlights = new ArrayList<>();

        destination = destination.toLowerCase();
        for (Flight flight : flights) {
            String flightDestination = flight.getDestination();
            if (flightDestination.toLowerCase().equals(destination)) {
                filteredFlights.add(flight);
            }
        }

        return filteredFlights;
    }

    public List<Flight> getAllFlights() {
        return flightDAO.findAll();
    }

    public Flight getFlightById(Long id) {
        return flightDAO.findById(id);
    }

    public void removeFlight(Long id) {
        flightDAO.delete(id);
    }
}
