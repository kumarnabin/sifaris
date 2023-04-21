package com.tookoocha.security.home;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public ResponseEntity<String> index() {
        return ResponseEntity.ok("Index Message");
    }

    @GetMapping("/api/v1/home/")
    public ResponseEntity<String> home() {
        return ResponseEntity.ok("Home from secured endpoint");
    }

}
