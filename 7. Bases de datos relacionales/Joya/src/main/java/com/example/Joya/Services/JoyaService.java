package com.example.Joya.Services;

import com.example.Joya.Dtos.JoyaDto;
import com.example.Joya.Dtos.JoyaResponseDto;
import com.example.Joya.Models.Joya;
import com.example.Joya.Repository.IJoya;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;


import java.util.List;
import java.util.stream.Collectors;
@Service
public class JoyaService {

    @Autowired
    IJoya iJoya;
    ModelMapper modelMapper = new ModelMapper();


    public List<JoyaResponseDto> findAllJoyas (){
        List<Joya> joyaList = iJoya.findAll();
        return joyaList.stream()
                .map(student ->
                        modelMapper.map(student, JoyaResponseDto.class)).collect(Collectors.toList());
    }

    public boolean addJoya(JoyaDto joyaDto){
        Joya joya = modelMapper.map(joyaDto, Joya.class);

        joya =  this.iJoya.save(joya);

        if(joya.getNro_identificatorio() != null) return true; else return false;
    }
}
