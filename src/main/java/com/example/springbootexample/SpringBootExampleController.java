package com.example.springbootexample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootExampleController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
