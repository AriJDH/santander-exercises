package com.example.showroom.controller;

import com.example.showroom.dto.request.SaleRequestDTO;
import com.example.showroom.dto.response.SaleResponseDTO;
import com.example.showroom.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaleController {

    @Autowired
    SaleService saleService;

    @PostMapping("/api/sale")
    public ResponseEntity<SaleResponseDTO> addSale(@RequestBody SaleRequestDTO saleRequestDTO){
        return ResponseEntity.ok().body(saleService.addSale(saleRequestDTO));
    }

}
