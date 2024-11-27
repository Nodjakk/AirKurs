package com.airkurs.controllers;

import com.airkurs.model.Flight;
import com.airkurs.model.FlightService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminPageController {

    @Autowired
    private FlightService flightService;

    @GetMapping("foradmin")
    public String getAdminPage() {
        return "adminpage";
    }

    @PostMapping("foradmin")
    public String addFlight( @ModelAttribute @Valid Flight flight,
                             BindingResult bindingResult,
                             Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("bindingResult", bindingResult);
            return "adminpage";
        }

        flightService.addFlight(flight);
        return "redirect:/foradmin?success=true";
    }
}
