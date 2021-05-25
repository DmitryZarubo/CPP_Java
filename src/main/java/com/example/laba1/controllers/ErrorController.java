package com.example.laba1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ErrorController {

    @GetMapping("/{errorPage}")
    public String wrongPage(@PathVariable(value = "errorPage") String page, Model model) {
        return "404";
    }

    @PostMapping("/{errorPage}")
    public String returnFib(@PathVariable(value = "errorPage") String page, Model model) {
        return "max";
    }
}