package com.example.sorteo.controller;

import com.example.sorteo.dto.ResponseAlumnoDto;
import com.example.sorteo.service.SorteoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SorteoController {

    @Autowired
    SorteoService sorteoService;

    @GetMapping("/students/draw")
    public ResponseEntity<List<ResponseAlumnoDto>> sortear(){
        return ResponseEntity.ok().body(sorteoService.sortear());
    }
}
