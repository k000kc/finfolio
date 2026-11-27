package ru.github.apetrov.finfolio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @GetMapping("/ping")
    public String ping() {
        return "Finfolio API is running!";
    }
}
