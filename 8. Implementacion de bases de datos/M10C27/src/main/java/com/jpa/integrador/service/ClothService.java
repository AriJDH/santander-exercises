package com.jpa.integrador.service;

import com.jpa.integrador.dto.request.ClothRequestDTO;
import com.jpa.integrador.dto.response.ClothesListResponseDTO;
import com.jpa.integrador.dto.response.ClothesResponseDTO;
import com.jpa.integrador.entity.Cloth;
import com.jpa.integrador.repository.ClothRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ClothService implements IClothService{

    @Autowired
    ClothRepository clothRepository;

    ModelMapper mapper = new ModelMapper();
    @Override
    public Boolean addCloth(ClothRequestDTO clothRequestDTO) {
        Cloth cloth = clothRepository.save(mapper.map(clothRequestDTO, Cloth.class));
        return cloth.getId() != null;
    }

    @Override
    public ClothesListResponseDTO findAllCloth() {
        List<Cloth> clothes = clothRepository.findAll();
        return new ClothesListResponseDTO(
                clothes.stream().map(
                        cloth -> mapper.map(cloth, ClothesResponseDTO.class)
                )
                        .collect(Collectors.toList())
        );
    }

    @Override
    public ClothesResponseDTO findOneCloth(Integer id) {
        Optional<Cloth> cloth = clothRepository.findById(id);
        return mapper.map(cloth.get(), ClothesResponseDTO.class);
    }

    @Override
    public Boolean updateCloth(Integer code, ClothRequestDTO clothRequestDTO) {
        if(clothRepository.findById(code).isPresent()) {
            clothRepository.save(mapper.map(clothRequestDTO, Cloth.class));
            return true;
        }else
            return false;
    }

    @Override
    public Boolean deleteCloth(Integer id) {
        if(clothRepository.findById(id).isPresent()) {
            clothRepository.deleteById(id);
            return true;
        }
        else
            return false;
    }

    @Override
    public ClothesListResponseDTO searchSaleBySize(String size) {
        List<Cloth> list = clothRepository.findClothBySizeEquals(size);
        return new ClothesListResponseDTO(
                list.stream().map(
                cloth -> mapper.map(cloth, ClothesResponseDTO.class)
        )
                .collect(Collectors.toList())
        );
    }

    @Override
    public ClothesListResponseDTO searchClothesByName(String name) {
        List<Cloth> list = clothRepository.findClothByNameContains(name);
        return new ClothesListResponseDTO(
                list.stream().map(
                                cloth -> mapper.map(cloth, ClothesResponseDTO.class)
                        )
                        .collect(Collectors.toList())
        );
    }
}
