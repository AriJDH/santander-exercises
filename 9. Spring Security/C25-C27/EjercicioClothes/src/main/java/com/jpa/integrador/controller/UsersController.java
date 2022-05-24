package com.jpa.integrador.controller;

import com.jpa.integrador.config.JwtUtil;
import com.jpa.integrador.dto.SuccessDTO;
import com.jpa.integrador.dto.request.UsersRequestDTO;
import com.jpa.integrador.service.UsersService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class UsersController {
    @Autowired
    UsersService usersService;



    @PostMapping("/newUser")
    public ResponseEntity<SuccessDTO> nuevoUsuario(@RequestBody UsersRequestDTO usersRequestDTO){
        return ResponseEntity.ok().body(usersService.crearUsuario(usersRequestDTO));

    }


    @PostMapping("/login")
    public ResponseEntity<SuccessDTO> login(@RequestBody UsersRequestDTO authenticationRequest) throws Exception {
        return ResponseEntity.ok(usersService.loguearse(authenticationRequest));
    }


}
