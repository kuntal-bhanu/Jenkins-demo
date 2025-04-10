package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/hello")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello from Spring Boot!");
    }

    @PostMapping("/add")
    public ResponseEntity<Integer> addNumbers(@RequestParam int a, @RequestParam int b) {
        int sum = a + b;
        return ResponseEntity.ok(sum);
    }
}
