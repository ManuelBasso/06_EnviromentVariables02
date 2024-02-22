package com.example.EnvironmentVariables;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Value("${myCustomVarTree.welcomeMsg}")
    String greeting;

    @GetMapping("/greeting")
    public String getGreeting() {
        return greeting;
    }
}
