package com.santander.sorteo.controller;

import com.santander.sorteo.dto.request.AlumnoResquestDTO;
import com.santander.sorteo.dto.request.TemaResquestDTO;
import com.santander.sorteo.dto.response.AlumnoResponseDTO;
import com.santander.sorteo.dto.response.SuccessDTO;
import com.santander.sorteo.dto.response.TemaResponseDTO;
import com.santander.sorteo.entity.Tema;
import com.santander.sorteo.service.TemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TemaController {
    @Autowired
    TemaService temaService;

    @PostMapping("/topics")
    public ResponseEntity<SuccessDTO> newTopic (@RequestBody TemaResquestDTO temaResquestDTO) {
        return ResponseEntity.status(201).body(temaService.newTopic(temaResquestDTO));
    }

    @GetMapping("/topics/")
    public ResponseEntity<List<TemaResponseDTO>> getTopics () {
        List<TemaResponseDTO> listTopics = temaService.getTopics();
        return new ResponseEntity<>(listTopics, HttpStatus.OK);
    }

}
