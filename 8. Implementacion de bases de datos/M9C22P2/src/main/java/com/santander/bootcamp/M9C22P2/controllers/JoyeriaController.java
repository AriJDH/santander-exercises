package com.santander.bootcamp.M9C22P2.controllers;

import com.santander.bootcamp.M9C22P2.dtos.Request.RequestJoyaDTO;
import com.santander.bootcamp.M9C22P2.dtos.Response.ResponseJoyaDTO;
import com.santander.bootcamp.M9C22P2.dtos.Response.ResponseUpdateJoyaDTO;
import com.santander.bootcamp.M9C22P2.dtos.SuccessDTO;
import com.santander.bootcamp.M9C22P2.services.JoyeriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class JoyeriaController {

    @Autowired
    @Qualifier("JoyeriaService")
    private JoyeriaService joyeriaService;


    @PostMapping(path = "/jewerly/new")
    public ResponseEntity<SuccessDTO> registrarJoya (@RequestBody RequestJoyaDTO requestJoyaDTO) {
        return new ResponseEntity<>(this.joyeriaService.registrarJoya(requestJoyaDTO), HttpStatus.CREATED);
    }

    @GetMapping(path = "/jewerly")
    public ResponseEntity<List<ResponseJoyaDTO>> listarJoya () {
        return new ResponseEntity<>(this.joyeriaService.listarJoyas(), HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/jewerly/delete/{id}")
    public ResponseEntity<SuccessDTO> eliminarJoya (@PathVariable Long id) {
        return new ResponseEntity<>(this.joyeriaService.eliminarJoya(id), HttpStatus.OK);
    }

    @PatchMapping(path = "/jewerly/update/{id}")
    public ResponseEntity<ResponseUpdateJoyaDTO> modificarJoya (
            @PathVariable Long id,
            @RequestBody RequestJoyaDTO requestJoyaDTO
    ) {
        return new ResponseEntity<>(this.joyeriaService.modificarJoya(id, requestJoyaDTO), HttpStatus.OK);
    }

}
