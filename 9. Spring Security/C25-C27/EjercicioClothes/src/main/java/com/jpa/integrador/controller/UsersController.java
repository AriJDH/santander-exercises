package com.jpa.integrador.controller;

import com.jpa.integrador.dto.SuccessDTO;
import com.jpa.integrador.dto.request.ClothRequestDTO;
import com.jpa.integrador.dto.request.UsersRequestDTO;
import com.jpa.integrador.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<SuccessDTO> loguearse(@RequestBody UsersRequestDTO usersRequestDTO){
        return ResponseEntity.ok().body(usersService.loguearse(usersRequestDTO));

    }
}
