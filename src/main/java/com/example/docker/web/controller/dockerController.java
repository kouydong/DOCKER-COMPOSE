package com.example.docker.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class dockerController {

    @GetMapping("/")
    public String sayDocker() {
        return "Hello Docker";
    }
}
