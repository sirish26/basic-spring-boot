package com.example.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcome {
    @GetMapping("/demo")
    public String welcome1(){
        return "<div style='text-align: center;'><h1>Welcome to first spring-boot project.</h1><p>It's a basic demo project. learning spring-boot </p></div>";
    }
}
