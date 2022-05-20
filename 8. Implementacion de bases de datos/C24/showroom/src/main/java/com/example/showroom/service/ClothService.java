package com.example.showroom.service;

import com.example.showroom.dto.ClothResponseDTO;
import com.example.showroom.dto.request.ClothRequestDTO;
import com.example.showroom.model.Cloth;
import com.example.showroom.repository.ClothRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClothService {
    @Autowired
    ClothRepository clothRepository;

    ModelMapper mapper = new ModelMapper();

    public ClothResponseDTO addCloth(ClothRequestDTO clothRequestDTO) {
        Cloth cloth = clothRepository.save(mapper.map(clothRequestDTO, Cloth.class));

        if(cloth.getId() == null){
            throw new RuntimeException("Error al guardar cloth, id generado es null");
        }

        return mapper.map(cloth, ClothResponseDTO.class);
    }

    public List<ClothResponseDTO> findAllClothes() {
        List<Cloth> clothes = clothRepository.findAll();
        return clothes.stream()
                .map(cloth -> mapper.map(cloth, ClothResponseDTO.class))
                .collect(Collectors.toList());
    }

    public ClothResponseDTO findClothById(Integer code) {
        Cloth cloth = clothRepository.findById(code).orElseThrow(RuntimeException::new);
        return mapper.map(cloth, ClothResponseDTO.class);
    }
}
