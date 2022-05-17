package com.example.jewelry.controller;

import com.example.jewelry.dto.JewelDto;
import com.example.jewelry.dto.JewelResponseDTO;
import com.example.jewelry.dto.SuccessDTO;
import com.example.jewelry.service.JewelryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        //TODO: agregar busqueda por is disabled, no debe mostrar las eliminadas
        List<JewelResponseDTO> jewelDTOs = jewelryService.findAllJewels();
        return ResponseEntity.ok().body(jewelDTOs);
    }

    @DeleteMapping("/jewelry/delete/{idJewel}")
    public ResponseEntity<JewelResponseDTO> deleteJewel(@PathVariable Integer idJewel){
        JewelResponseDTO jewelResponseDTO = jewelryService.deleteJewel(idJewel);
        return ResponseEntity.ok().body(jewelResponseDTO);
    }

    @PutMapping("/jewelry/update/{idJewel}")
    public ResponseEntity<JewelResponseDTO> addJewel(@PathVariable Integer idJewel, @RequestBody JewelDto jewelDto){
        JewelResponseDTO jewelResponseDTO = jewelryService.updateJewel(idJewel, jewelDto);
        return ResponseEntity.ok().body(jewelResponseDTO);
    }

}
