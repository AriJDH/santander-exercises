package com.practica.calculadorametroscuadrados.controller;

import com.practica.calculadorametroscuadrados.dto.HouseDTO;
import com.practica.calculadorametroscuadrados.dto.HouseResponseDTO;
import com.practica.calculadorametroscuadrados.dto.RoomDTO;
import com.practica.calculadorametroscuadrados.service.CalculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateRestController {

  @Autowired
  CalculateService calculateService;

  @PostMapping("/calculate")
  public HouseResponseDTO calculate(@RequestBody HouseDTO house){
    return calculateService.calculate(house);
  }
}
