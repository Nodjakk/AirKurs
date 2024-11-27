package com.airkurs.controllers;


import com.airkurs.model.Flight;
import com.airkurs.model.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController {

    @Autowired
    private FlightService flightService;

    @GetMapping(value = "/api/flights", produces = "application/json")
    public List<Flight> flights(@RequestParam(name = "destination", required = false) String destination) {
        List<Flight> flights = flightService.getFlightsByDestination(destination);
        if (destination != null && !destination.isEmpty()) {
            return flights;
        }
        return flights ;
    }
}
