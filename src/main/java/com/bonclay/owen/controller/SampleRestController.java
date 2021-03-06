package com.bonclay.owen.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SampleRestController {
    @Value("${appName}")
    private String appName;

    @GetMapping
    public String indexHome() throws Exception {
        checkedException();
//        uncheckedException();
        return appName + " index";
    }

    private void checkedException() throws Exception {
        throw new Exception("checked exception");
    }

    private void uncheckedException() throws RuntimeException {
        throw new RuntimeException("unchecked exception");
    }
}
