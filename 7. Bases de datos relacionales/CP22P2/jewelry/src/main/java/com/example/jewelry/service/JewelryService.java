package com.example.jewelry.service;

import com.example.jewelry.dto.JewelDto;
import com.example.jewelry.dto.SuccessDTO;
import com.example.jewelry.model.Jewel;
import com.example.jewelry.repository.JewelRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

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
}
