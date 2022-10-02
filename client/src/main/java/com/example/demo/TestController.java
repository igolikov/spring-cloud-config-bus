package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @Autowired
    private AppConfiguration appConfig;
    @GetMapping("/config")
    public String printConfig() {
        return appConfig.toString();
    }
}
