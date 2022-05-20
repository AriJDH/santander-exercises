package com.example.showroom.controller;

import com.example.showroom.dto.ClothResponseDTO;
import com.example.showroom.dto.request.ClothRequestDTO;
import com.example.showroom.service.ClothService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClothController {

    @Autowired
    ClothService clothService;

    @PostMapping("/api/clothes")
    public ResponseEntity<ClothResponseDTO> addCloth(@RequestBody ClothRequestDTO clothRequestDTO){
        ClothResponseDTO clothResponseDTO = clothService.addCloth(clothRequestDTO);
        return ResponseEntity.ok().body(clothResponseDTO);        
    }

    @GetMapping("/api/clothes/")
    public ResponseEntity<List<ClothResponseDTO>> getClothes(){
        return ResponseEntity.ok().body(clothService.findAllClothes());
    }

    @GetMapping("/api/clothes/{code}")
    public ResponseEntity<ClothResponseDTO> getClothes(@PathVariable Integer code){
        return ResponseEntity.ok().body(clothService.findClothById(code));
    }


}
