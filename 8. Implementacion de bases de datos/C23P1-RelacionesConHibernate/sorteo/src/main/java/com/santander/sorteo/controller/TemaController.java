package com.santander.sorteo.controller;

import com.santander.sorteo.dto.request.AlumnoResquestDTO;
import com.santander.sorteo.dto.request.TemaResquestDTO;
import com.santander.sorteo.dto.response.SuccessDTO;
import com.santander.sorteo.service.TemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemaController {
    @Autowired
    TemaService temaService;

    @PostMapping("/topics")
    public ResponseEntity<SuccessDTO> newTopic (@RequestBody TemaResquestDTO temaResquestDTO) {
        return ResponseEntity.status(201).body(temaService.newTopic(temaResquestDTO));
    }
}
