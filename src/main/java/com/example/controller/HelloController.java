package com.example.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    @GetMapping("/world")
    @PreAuthorize("hasRole('admin')")
    public String helloWorld() {
        return "Hello World For Admin";
    }

    @GetMapping("/worldUser")
    @PreAuthorize("hasRole('user')")
    public String helloWorldUser() {
        return "Hello World For User";
    }
}
