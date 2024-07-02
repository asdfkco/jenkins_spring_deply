package com.example.jenkins_spring_deply;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
    @GetMapping("/")
    public String test(){
        return "version 1.0";
    }
}
