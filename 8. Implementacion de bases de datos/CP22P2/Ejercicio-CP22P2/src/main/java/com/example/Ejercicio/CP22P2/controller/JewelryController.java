package com.example.Ejercicio.CP22P2.controller;

import com.example.Ejercicio.CP22P2.dto.response.SuccessDTO;
import com.example.Ejercicio.CP22P2.dto.request.JewerlyRequestDTO;
import com.example.Ejercicio.CP22P2.dto.response.JewerlyResponseDTO;
import com.example.Ejercicio.CP22P2.dto.response.SuccessUpdateDTO;
import com.example.Ejercicio.CP22P2.service.JewerlyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JewelryController {

    @Autowired
    JewerlyService jewerlyService;

    @PostMapping("/jewerly/new")
    public ResponseEntity<SuccessDTO> addJewerly(@RequestBody JewerlyRequestDTO student){
        Integer id= this.jewerlyService.addJewerly(student);
        if(id!=null){
            return ResponseEntity.ok()
                    .body(new SuccessDTO("Se ha creado la joya con id "+id, HttpStatus.CREATED.value()));
        }
        else
            throw new RuntimeException();
    }
    @GetMapping("/jewerly")
    public ResponseEntity<List<JewerlyResponseDTO>> listJewerly(){
        return ResponseEntity.ok().body(jewerlyService.findAllJewerlies());
    }

    @GetMapping("/jewerly/delete/{idJewerly}")
    public ResponseEntity<SuccessDTO> deleteJewerly(@PathVariable Integer idJewerly){
        return ResponseEntity.ok().body(jewerlyService.deleteJewerly(idJewerly));
    }

    @GetMapping("/jewerly/update/{idJewerly}")
    public ResponseEntity<SuccessUpdateDTO> updateJewerly(@PathVariable Integer idJewerly){
        return ResponseEntity.ok().body(jewerlyService.updateJewerly(idJewerly));
    }
}
