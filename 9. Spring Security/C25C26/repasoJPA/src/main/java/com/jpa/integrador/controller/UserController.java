package com.jpa.integrador.controller;

import com.jpa.integrador.config.JwtUtils;
import com.jpa.integrador.dto.request.UserRequestDTO;
import com.jpa.integrador.dto.response.Response;
import com.jpa.integrador.dto.response.UserResponseDTO;
import com.jpa.integrador.service.UserDetailsServiceImpl;
import com.jpa.integrador.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@PreAuthorize("hasAuthority('ALL')")
public class UserController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserService userService;

    @Autowired
    private JwtUtils jwtUtil;

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @GetMapping("/")
    public String helloWorld(){
        return "Hello world";
    }

    @PreAuthorize("hasAuthority('ROLE_ADMIN') OR hasAuthority('ROLE_USER')")
    @GetMapping("/user")
    public String helloUser(){
        return "Hello user";
    }

    @PreAuthorize("hasRole('NEW')")
    @GetMapping("/new")
    public String helloNewRole(){
        return "Hello new role";
    }

    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @GetMapping("/admin")
    public String helloAdmin(){
        return "Hello admin";
    }

    @PostMapping("/authenticate")
    @PreAuthorize("permitAll()")
    public ResponseEntity<Response> createAuthenticationToken(@RequestBody UserRequestDTO authenticationRequest) throws Exception{
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                    authenticationRequest.getUsername(), authenticationRequest.getPassword()));
        } catch (DisabledException e) {
            throw new Exception("USER_DISABLED", e);
        }
        catch (BadCredentialsException e) {
            throw new Exception("INVALID_CREDENTIALS", e);
        }

        UserDetails userdetails = userDetailsService.loadUserByUsername(authenticationRequest.getUsername());
        String token = jwtUtil.generateToken(userdetails);
        return ResponseEntity.ok(new Response(token));
    }

    @PreAuthorize("permitAll()")
    @PostMapping("/signup")
    public ResponseEntity<UserResponseDTO> login(@RequestBody UserRequestDTO userRequestDTO){
        return ResponseEntity.ok().body(userService.signup(userRequestDTO));
    }

}
