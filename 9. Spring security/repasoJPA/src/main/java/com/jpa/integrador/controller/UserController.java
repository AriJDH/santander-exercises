package com.jpa.integrador.controller;

import com.jpa.integrador.dto.SignupDTO;
import com.jpa.integrador.dto.SuccessDTO;
import com.jpa.integrador.dto.UserRequestDTO;
import com.jpa.integrador.dto.UserResponseDTO;
import com.jpa.integrador.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@PreAuthorize("hasAuthority('ALL')")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String helloWorld(){
        return "Hello world";
    }

    @PreAuthorize("hasAuthority('ROLE_ADMIN') OR hasAuthority('ROLE_USER')")
    @GetMapping("/user")
    public String helloUser(){
        return "Hello user";
    }

    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @GetMapping("/admin")
    public String helloAdmin(){
        return "Hello admin";
    }

    @GetMapping("/login/{username}")
    public String login(@PathVariable String username){
        userService.login(username);
        return "Logeado rey";
    }

    @PreAuthorize("permitAll()")
    @PostMapping("/signup")
    public ResponseEntity<UserResponseDTO> login(@RequestBody UserRequestDTO userRequestDTO){
        return ResponseEntity.ok().body(userService.signup(userRequestDTO));
    }

}
