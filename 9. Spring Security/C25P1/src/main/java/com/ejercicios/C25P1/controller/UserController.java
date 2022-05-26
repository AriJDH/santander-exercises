package com.ejercicios.C25P1.controller;

import com.ejercicios.C25P1.service.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.security.authorization.AuthorityReactiveAuthorizationManager.hasAuthority;

@RestController
@PreAuthorize("denyAll()")
public class UserController {

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @GetMapping("/")
    public String helloWorld(){
        return "Hello world";
    }
    @GetMapping("/admin")
    public String helloAdmin(){
        return "Hello Admin";
    }
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @GetMapping("/hola")
    public String helloWorld2(){
        return "Hello world";
    }

}
