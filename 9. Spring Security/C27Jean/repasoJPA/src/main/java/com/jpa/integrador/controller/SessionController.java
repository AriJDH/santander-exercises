package com.jpa.integrador.controller;

import com.jpa.integrador.dto.SuccessDTO;
import com.jpa.integrador.dto.request.LoginDTO;
import com.jpa.integrador.service.SecurityService;
import com.jpa.integrador.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SessionController {

    @Autowired
    UserService userService;

    @PostMapping("/login/")
    public ResponseEntity<SuccessDTO> login(@RequestBody LoginDTO login) throws Exception{
        String token = userService.login(login.getUsername(), login.getPassword());
        if(token != null)
            return ResponseEntity.ok().body(new SuccessDTO("Se logeo exitosamente con token: " + token, 200));
        else
            throw new UsernameNotFoundException("No se encontro el usuario");
    }
}
