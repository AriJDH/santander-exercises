package com.jpa.joyeria.controller;

import com.jpa.joyeria.dto.JoyaDTO;
import com.jpa.joyeria.dto.SuccessDTO;
import com.jpa.joyeria.dto.response.JoyaResponseDTO;
import com.jpa.joyeria.service.JewerlyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JewerlyController {
    @Autowired
    JewerlyService jewerlyService;

    @PostMapping("/jewerly/new")
    public ResponseEntity<SuccessDTO> addJoya(@RequestBody JoyaDTO joyaDTO){
        if(this.jewerlyService.addJoya(joyaDTO)){
            return ResponseEntity.ok()
                    .body(new SuccessDTO("Se ha creado la Joya", HttpStatus.CREATED.value()));

        }
        else
            throw new RuntimeException();
    }
    @GetMapping("/jewerly")
    public ResponseEntity<List<JoyaResponseDTO>> listJoya(){
        return ResponseEntity.ok().body(jewerlyService.findAllJoyas());
    }

    @DeleteMapping("/jewerly/delete/{nro_identificatorio}")
    public ResponseEntity<SuccessDTO> deleteJoya(@PathVariable Integer nro_identificatorio){
        return ResponseEntity.ok().body(jewerlyService.deleteJoya(nro_identificatorio));
    }
    @DeleteMapping("/jewerly/update/{id_modificar}")
    public ResponseEntity<JoyaResponseDTO> actualizacionJoya(@RequestBody JoyaDTO joyaDTO) {
        JoyaResponseDTO respuesta = jewerlyService.actualizar(joyaDTO);
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }
}
