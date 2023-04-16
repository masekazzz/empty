package ru.example.security;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AController {
    @PostMapping(path = "/auth/login")
    public ResponseEntity<String> login(){
        return ResponseEntity.ok().build();
    }
}
