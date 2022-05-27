package com.jpa.integrador.controller;


import com.jpa.integrador.config.SecurityConfig;
import com.jpa.integrador.dto.request.UserLoginRequestDTO;
import com.jpa.integrador.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;


    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody UserLoginRequestDTO userLoginRequestDTO){
        return ResponseEntity.ok().body(userService.login(userLoginRequestDTO.getUsername(), userLoginRequestDTO.getPassword()));
    }

    @GetMapping("/helloAdmin")
    public ResponseEntity<String>helloAdmin(){
        return ResponseEntity.ok().body(userService.helloAdmin());
    }
    @GetMapping("/helloUser")
    public ResponseEntity<String>helloUser(){
        return ResponseEntity.ok().body("hola user");
    }
    @GetMapping("/helloWorld")
    public ResponseEntity<String>helloWorld(){
        return ResponseEntity.ok().body("hola mundo");
    }
}
