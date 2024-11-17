package com.airkurs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomePageController {

    @GetMapping("/")
    public String getHomePage(@RequestParam(name = "destination", defaultValue = "") String destination) {
        return "homepage";
    }
}
