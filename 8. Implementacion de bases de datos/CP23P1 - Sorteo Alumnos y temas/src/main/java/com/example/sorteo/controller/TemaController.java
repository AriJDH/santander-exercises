package com.example.sorteo.controller;

import com.example.sorteo.dto.ResponseDto;
import com.example.sorteo.dto.RequestTemaDto;
import com.example.sorteo.dto.ResponseTemaDto;
import com.example.sorteo.service.TemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class TemaController {

    @Autowired
    TemaService temaService;

    @PostMapping("/topics")
    public ResponseEntity<ResponseDto> addStudent(@RequestBody RequestTemaDto temaDto) {
        return ResponseEntity.status(201).body(temaService.addTema(temaDto));
    }

    @GetMapping("/topics/")
    public ResponseEntity<List<ResponseTemaDto>> listarTemas(){
        return ResponseEntity.ok().body(temaService.listarTemas());
    }
}
