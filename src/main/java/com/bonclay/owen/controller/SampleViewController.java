package com.bonclay.owen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SampleViewController {
    @GetMapping
    public String index() throws Exception {
        checkedException();
//        uncheckedException();
        return "index";
    }

    private void checkedException() throws Exception {
        throw new Exception("checked exception");
    }

    private void uncheckedException() throws RuntimeException {
        throw new RuntimeException("unchecked exception");
    }
}
