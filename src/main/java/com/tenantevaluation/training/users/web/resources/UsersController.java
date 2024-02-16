package com.tenantevaluation.training.users.web.resources;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1.0.0/users")
@AllArgsConstructor
public class UsersController {



    @GetMapping("/test")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("Test");
    }



}
