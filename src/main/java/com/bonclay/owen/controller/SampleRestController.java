package com.bonclay.owen.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class SampleRestController {
    @Value("${appName}")
    private String appName;

    @GetMapping
    public String indexHome() {
        return appName + " index";
    }
}
