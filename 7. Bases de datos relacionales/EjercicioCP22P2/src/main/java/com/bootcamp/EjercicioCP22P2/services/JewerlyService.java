package com.bootcamp.EjercicioCP22P2.services;

import com.bootcamp.EjercicioCP22P2.dtos.*;
import com.bootcamp.EjercicioCP22P2.models.Jewerly;
import com.bootcamp.EjercicioCP22P2.repositories.JewerlyRepository;
import org.hibernate.sql.Update;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class JewerlyService {

    @Autowired
    JewerlyRepository jewerlyRepository;

    ModelMapper modelMapper = new ModelMapper();

    public NewJewerlyResponseDTO createNewJewerly(NewJewerlyRequestDTO newJewerlyRequestDTO) {
        Jewerly jewerly = modelMapper.map(newJewerlyRequestDTO, Jewerly.class);
        jewerlyRepository.save(jewerly);
        if( jewerlyRepository.existsById(jewerly.getNro_identificatorio())){
            return new NewJewerlyResponseDTO("Joya creada correctamente con numero identificatorio: " + jewerly.getNro_identificatorio(), HttpStatus.CREATED.value());
        }
        return new NewJewerlyResponseDTO("Error al crear la joya", HttpStatus.NOT_FOUND.value());
    }

    public List<JewerlyDTO> getAllJewerly() {
        List<JewerlyDTO> jewerlyDTOSList = new ArrayList<>();
        jewerlyRepository.findAll().forEach(jewerly -> {
            if(jewerly.isEnVenta()){
                jewerlyDTOSList.add(modelMapper.map(jewerly, JewerlyDTO.class));
            }
        });
        return jewerlyDTOSList;
    }

    public DeleteJewerlyResponseDTO deleteJewerly(int id) {
        if(jewerlyRepository.existsById(id)) {

            Jewerly jewerlyFromDatabase = jewerlyRepository.getById(id);
            jewerlyFromDatabase.setEnVenta(false);
            jewerlyRepository.save(jewerlyFromDatabase);

            return new DeleteJewerlyResponseDTO("Joya eliminada correctamente", HttpStatus.OK.value());
        }

        return new DeleteJewerlyResponseDTO("La joya ingresada no existe en la BD", HttpStatus.NOT_FOUND.value());
    }

    public UpdateJewerlyResponseDTO updateJewerly(int id, UpdateJewerlyRequestDTO updateJewerlyRequestDTO) {
        if(jewerlyRepository.existsById(id)){
            Jewerly toUpdateJewerly = jewerlyRepository.getById(id);

            toUpdateJewerly.setMaterial(updateJewerlyRequestDTO.getMaterial());
            toUpdateJewerly.setPoseePiedra(updateJewerlyRequestDTO.isPoseePiedra());
            toUpdateJewerly.setEnVenta(toUpdateJewerly.isEnVenta());
            toUpdateJewerly.setNombre(toUpdateJewerly.getNombre());
            toUpdateJewerly.setParticularidad(toUpdateJewerly.getParticularidad());
            toUpdateJewerly.setPeso(toUpdateJewerly.getPeso());

            jewerlyRepository.save(toUpdateJewerly);
            return new UpdateJewerlyResponseDTO("Joya actualizada correctamente", HttpStatus.OK.value(), modelMapper.map(updateJewerlyRequestDTO, JewerlyDTO.class));
        }
        return new UpdateJewerlyResponseDTO("Error: la joya ingresada no existe en la BD", HttpStatus.NOT_FOUND.value(), modelMapper.map(updateJewerlyRequestDTO, JewerlyDTO.class));
    }
}
