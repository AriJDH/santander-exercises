package com.ejercicios.C25P1.controller;

import com.ejercicios.C25P1.config.JwtUtils;
import com.ejercicios.C25P1.dto.request.UserRequest;
import com.ejercicios.C25P1.dto.response.UserResponse;
import com.ejercicios.C25P1.service.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@PreAuthorize("hasAuthority('ALL')")
public class UserController {

    @Autowired
    private UserDetailsServiceImpl userDetailsService;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JwtUtils jwtTokenUtil;

    @PostMapping(value = "/authenticate")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody UserRequest authenticationRequest) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                    authenticationRequest.getUsername(), authenticationRequest.getPassword()));

        } catch (DisabledException e) {
            throw new Exception("USER_DISABLED", e);
        } catch (BadCredentialsException e) {
            throw new Exception("INVALID_CREDENTIALS", e);
        }
        final UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getUsername());

        final String token = jwtTokenUtil.generateToken(userDetails);

        return ResponseEntity.ok(new UserResponse(token));
    }


    @GetMapping("/")
    public String helloWorld() {
        return "Hello world";
    }

    @GetMapping("/admin")
    public String helloAdmin() {
        return "Hello Admin";
    }


    //@PreAuthorize("hasAuthority('ROLE_USER')")
    @GetMapping("/user")
    public String helloAdmin2() {
        return "Hello user";
    }

    @GetMapping("/prueba")
    public String prueba() {
        return "Hello prueba";
    }
}
