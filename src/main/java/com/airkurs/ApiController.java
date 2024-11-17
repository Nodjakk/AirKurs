package com.airkurs;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ApiController {

    @GetMapping(value = "/api/flights", produces = "application/json")
    public List<Flight> flights(@RequestParam(name = "destination", required = false) String destination) {
        Flight flight = new Flight("тест", "123", "sdada");
        List<Flight> flights = new ArrayList<>();
        flights.add(flight);
        if (destination != null && !destination.isEmpty()) {
            return flights;
        }
        return flights ;
    }
}
