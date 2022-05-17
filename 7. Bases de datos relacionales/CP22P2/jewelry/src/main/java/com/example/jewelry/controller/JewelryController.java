package com.example.jewelry.controller;

import com.example.jewelry.dto.JewelDto;
import com.example.jewelry.dto.JewelResponseDTO;
import com.example.jewelry.dto.SuccessDTO;
import com.example.jewelry.service.JewelryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JewelryController {

    @Autowired
    private JewelryService jewelryService;

    @GetMapping("/home")
    public String home(){
        return "You are in home";
    }

    @PostMapping("/jewelry/new")
    public ResponseEntity<SuccessDTO> addJewel(@RequestBody JewelDto jewelDto){
        SuccessDTO successDTO = jewelryService.addJewel(jewelDto);
        return ResponseEntity.ok().body(successDTO);
    }

    @GetMapping("/jewelry")
    public ResponseEntity<List<JewelResponseDTO>> getJewels(){
        List<JewelResponseDTO> jewelDTOs = jewelryService.findAllJewels();
        return ResponseEntity.ok().body(jewelDTOs);
    }
}
