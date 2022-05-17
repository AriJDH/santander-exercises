package com.example.jewelry.service;

import com.example.jewelry.dto.JewelDto;
import com.example.jewelry.dto.JewelResponseDTO;
import com.example.jewelry.dto.SuccessDTO;
import com.example.jewelry.model.Jewel;
import com.example.jewelry.repository.JewelRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class JewelryService {

    @Autowired
    JewelRepository jewelRepository;
    ModelMapper modelMapper = new ModelMapper();

    public SuccessDTO addJewel(JewelDto jewelDto) {
        Jewel jewel = modelMapper.map(jewelDto, Jewel.class);
        jewel = jewelRepository.save(jewel);

        if(jewel.getId() == null){
            throw new RuntimeException();
        }

        return new SuccessDTO("Se ha creado la joya, id " + jewel.getId(), HttpStatus.CREATED.value());
    }

    public List<JewelResponseDTO> findAllJewels() {
        List<Jewel> jewels = jewelRepository.findAll();
        return jewels.stream().map(jewel -> modelMapper.map(jewel, JewelResponseDTO.class)).collect(Collectors.toList());
    }

    public JewelResponseDTO deleteJewel(Integer idJewel) {
        // busco la joya
        Jewel jewel = jewelRepository.findById(idJewel).orElseThrow(RuntimeException::new);

        // la elimino logicamente
        jewel.setSellable(false);

        // la guardo
        jewelRepository.save(jewel);

        return modelMapper.map(jewel, JewelResponseDTO.class);
    }
}
