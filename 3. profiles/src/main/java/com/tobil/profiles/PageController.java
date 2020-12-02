package com.tobil.profiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {

    @Value("${spring.profiles.active}")
    private String environment;

    @Value("${msg}")
    private String msg;

    @GetMapping("/msg")
    public String message() {
        return msg;
    }

    @GetMapping("/")
    public String home() {
        return environment;
    }
}
