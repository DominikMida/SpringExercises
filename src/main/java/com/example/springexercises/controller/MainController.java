package com.example.springexercises.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {
    private String name;


    @GetMapping("/helloworld")
    public String helloWorld(@RequestParam(name = "ziemniaczek") String name) {
        return "Hello " + name;
    }

    @GetMapping("/helloworld/{name}/{name2}")
    public String helloYou(@PathVariable String name, @PathVariable String name2) {
        return "Hello " + name + " " + name2;
    }

    @GetMapping("/name")
    public String name() {
        return "Hello " + name;
    }

    @PostMapping("/post")
    public String write(@RequestBody String name) {
        this.name = name;
        return name;
    }


}
