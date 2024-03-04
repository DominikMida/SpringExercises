package com.example.springexercises.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SimpleController {
    @Value("${spring.application.name}")
    String appName;

    @GetMapping("/home")
    public String homePage(Model model) {
        model.addAttribute("appName2", appName);
        return "home";
    }
}
