package com.santander.joyeria.controller;

import com.santander.joyeria.dtos.request.JoyaRequestDTO;
import com.santander.joyeria.dtos.response.JoyaResponseDTO;
import com.santander.joyeria.dtos.response.SuccessDTO;
import com.santander.joyeria.service.JoyaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JoyaController {
    @Autowired
    JoyaService joyaService;

    @PostMapping("/jewerly/new")
    public ResponseEntity<SuccessDTO> addJewel(@RequestBody JoyaRequestDTO joyaDto){
        SuccessDTO successDTO = joyaService.addJoya(joyaDto);
        return ResponseEntity.ok().body(successDTO);
    }

    @GetMapping(path = "/jewerly")
    public ResponseEntity<List<JoyaResponseDTO>> getJoyas() {
        return ResponseEntity.ok().body(joyaService.getJoyas());
    }

    @DeleteMapping("/jewelry/delete/{idJoya}")
    public ResponseEntity<JoyaResponseDTO> deleteJewel(@PathVariable Integer idJoya){
        JoyaResponseDTO joyaResponseDTO = joyaService.deleteJoya(idJoya);
        return ResponseEntity.ok().body(joyaResponseDTO);
    }

    @PutMapping("/jewelry/update/{idJoya}")
    public ResponseEntity<JoyaResponseDTO> updateJoya(@PathVariable Integer idJoya, @RequestBody JoyaRequestDTO joyaDto){
        JoyaResponseDTO joyaResponseDTO = joyaService.updateJoya(idJoya, joyaDto);
        return ResponseEntity.ok().body(joyaResponseDTO);
    }
}
