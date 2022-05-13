package com.practica.calculadorametroscuadrados.service;

import com.practica.calculadorametroscuadrados.dto.HouseDTO;
import com.practica.calculadorametroscuadrados.dto.HouseResponseDTO;
import com.practica.calculadorametroscuadrados.dto.RoomDTO;
import org.springframework.stereotype.Service;

@Service
public class CalculateService {
  public HouseResponseDTO calculate(HouseDTO house) {
    HouseResponseDTO response = new HouseResponseDTO(house);
    calculateRoomSquareFeet(house, response);
    response.setPrice(calculatePrice(response.getSquareFeet()));
    return response;
  }

  private void calculateRoomSquareFeet(HouseDTO house, HouseResponseDTO response) {
    Integer totalSquareFeet = 0;
    RoomDTO biggest = null;
    Integer maxRoom = 0;
    for (RoomDTO room : house.getRooms()) {
      Integer squareFeet = room.getSquareFeet();
      totalSquareFeet += squareFeet;
      if (biggest == null || squareFeet > maxRoom){
        biggest = room;
        maxRoom = squareFeet;
      }
    }
    response.setSquareFeet(totalSquareFeet);
    response.setBiggest(biggest);
  }

  private int calculatePrice(Integer result) {
    return result * 800;
  }
}
