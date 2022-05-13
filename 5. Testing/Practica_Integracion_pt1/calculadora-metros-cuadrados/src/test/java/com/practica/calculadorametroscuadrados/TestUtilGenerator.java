package com.practica.calculadorametroscuadrados;

import com.practica.calculadorametroscuadrados.dto.HouseDTO;
import com.practica.calculadorametroscuadrados.dto.HouseResponseDTO;
import com.practica.calculadorametroscuadrados.dto.RoomDTO;

import java.util.ArrayList;
import java.util.List;

public class TestUtilGenerator {

     public static HouseDTO createHouse(){
        HouseDTO houseDTOSent = new HouseDTO();
        houseDTOSent.setAddress("Algo");
        houseDTOSent.setName("Algo");
        List<RoomDTO> roomDTOList = new ArrayList<>();
        roomDTOList.add(createRoom());
        roomDTOList.add(createRoom2());
        houseDTOSent.setRooms(roomDTOList);
        return houseDTOSent;
    }

    public static RoomDTO createRoom(){
        RoomDTO roomDTO = new RoomDTO();
        roomDTO.setLength(10);
        roomDTO.setWidth(10);
        roomDTO.setName("Algo Room");
        return roomDTO;
    }
    public static RoomDTO createRoom2(){
        RoomDTO roomDTO = new RoomDTO();
        roomDTO.setLength(9);
        roomDTO.setWidth(9);
        roomDTO.setName("Algo Room");
        return roomDTO;
    }

    public static HouseResponseDTO createHouseResponse(){
         HouseResponseDTO houseResponseDTO= new HouseResponseDTO(createHouse());

         houseResponseDTO.setBiggest(createRoom());
         houseResponseDTO.setPrice(144800);
         houseResponseDTO.setSquareFeet(100);
         return houseResponseDTO;
    }


}
