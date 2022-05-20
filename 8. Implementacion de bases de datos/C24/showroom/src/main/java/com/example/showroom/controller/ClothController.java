package com.example.showroom.controller;

import com.example.showroom.dto.ClothResponseDTO;
import com.example.showroom.dto.request.ClothRequestDTO;
import com.example.showroom.service.ClothService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClothController {

    @Autowired
    ClothService clothService;

    @PostMapping("/api/clothes")
    public ResponseEntity<ClothResponseDTO> addCloth(@RequestBody ClothRequestDTO clothRequestDTO){
        ClothResponseDTO clothResponseDTO = clothService.addCloth(clothRequestDTO);
        return ResponseEntity.ok().body(clothResponseDTO);        
    }

    
}
