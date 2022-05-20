package com.example.showroom.service;

import com.example.showroom.dto.ClothResponseDTO;
import com.example.showroom.dto.request.ClothRequestDTO;
import com.example.showroom.model.Cloth;
import com.example.showroom.repository.ClothRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
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


    public ClothResponseDTO updateCloth(Integer code, ClothRequestDTO clothRequestDTO) {
        Optional<Cloth> clothOptional = clothRepository.findById(code);
        Cloth cloth = mapper.map(clothRequestDTO, Cloth.class);

        if(clothOptional.isPresent()){
            cloth.setId(code);
        }

        cloth = clothRepository.save(cloth);

        return mapper.map(cloth, ClothResponseDTO.class);
    }

    public ClothResponseDTO deleteCloth(Integer code) {
        Cloth cloth = clothRepository.findById(code).orElseThrow(RuntimeException::new);
        clothRepository.deleteById(code);

        return mapper.map(cloth, ClothResponseDTO.class);
    }

    public List<ClothResponseDTO> findClothesBySize(String size) {
        List<Cloth> clothes = clothRepository.findClothesBySize(size);
        return clothes.stream()
                .map(cloth -> mapper.map(cloth, ClothResponseDTO.class))
                .collect(Collectors.toList());

    }

    public List<ClothResponseDTO> findClothesByName(String name) {
        List<Cloth> clothes = clothRepository.findClothesByName(name);
        return clothes.stream()
                .map(cloth -> mapper.map(cloth, ClothResponseDTO.class))
                .collect(Collectors.toList());

    }
}
