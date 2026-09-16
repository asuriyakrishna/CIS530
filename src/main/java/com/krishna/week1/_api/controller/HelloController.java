package com.krishna.week1._api.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University,
 * all rights reserved.
 */
@RestController
public class HelloController {

    @GetMapping(value = "/api/hello", produces = "text/plain")
    public String hello() {
        return "Hello from Spring Boot!";
    }

    @GetMapping("/api/status")
    public Map<String, String> status() {
        return Map.of(
            "status", "success",
            "message", "API is running"
        );
    }
}