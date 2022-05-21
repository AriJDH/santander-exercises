package com.santander.Joyeria.controller;

import com.santander.Joyeria.dto.RespuestaDTO;
import com.santander.Joyeria.dto.request.JoyaDTORequest;
import com.santander.Joyeria.dto.response.JoyaDTOResponse;
import com.santander.Joyeria.dto.response.SuccessDTO;
import com.santander.Joyeria.service.JoyaService;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JoyaController {
    @Autowired
    JoyaService joyaService;

    @PostMapping("/jewerly/new")
    public ResponseEntity<SuccessDTO> newJoya(@RequestBody JoyaDTORequest joyaDTORequest){
        return ResponseEntity.status(201).body(joyaService.newJoya(joyaDTORequest));
    }

    @GetMapping("/jewerly")
    public ResponseEntity<List<JoyaDTOResponse>> getJoyas() {
        List<JoyaDTOResponse> listJoyas = joyaService.getJoyas();
        return new ResponseEntity<>(listJoyas, HttpStatus.OK);
    }

    @DeleteMapping("/jewerly/delete/{id}")
    public ResponseEntity<RespuestaDTO> deleteJoya(@PathVariable Integer id) {
        return ResponseEntity.ok().body(joyaService.deleteJoya(id));
    }
    @PutMapping("/jewerly/update/{id}")
    public ResponseEntity<SuccessDTO> updateJoya(@PathVariable Integer id, @RequestBody JoyaDTORequest joyaDTORequest) {
        return ResponseEntity.ok().body(joyaService.updateJoya(id,joyaDTORequest));
    }

}
