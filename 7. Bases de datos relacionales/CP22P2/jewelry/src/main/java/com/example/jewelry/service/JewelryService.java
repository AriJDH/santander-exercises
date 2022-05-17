package com.example.jewelry.service;

import com.example.jewelry.dto.SuccessDTO;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class JewelryService {

    public SuccessDTO addJewel() {
        return new SuccessDTO("Se ha creado la joya " + 1, HttpStatus.CREATED.value());
    }
}
