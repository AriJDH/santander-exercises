package com.jpa.joyeria.services;
import com.jpa.joyeria.joyeriaDTO.StatusCode;
import org.modelmapper.ModelMapper;
import com.jpa.joyeria.joyeriaDTO.JoyaDTO;
import com.jpa.joyeria.models.Joya;
import com.jpa.joyeria.repository.joyeriaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class JoyeriaService {

    @Autowired
    joyeriaRepo joyeriaRepo;
    ModelMapper modelMapper = new ModelMapper();
    public StatusCode addJoya(JoyaDTO joyaDTO){
        Joya joya = modelMapper.map(joyaDTO, Joya.class);

        joya =  this.joyeriaRepo.save(joya);

        if(joya.getId() != null)
           return new StatusCode(HttpStatus.OK.value(), "se agregó exitosamente con el id: " + joya.getId());
        else
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No se agrego correctamente");
    }

    public List<JoyaDTO> findAllJoyas(){
        List<Joya> joyasList =  joyeriaRepo.findAll();
        return joyasList.stream().map(s -> modelMapper.map(s, JoyaDTO.class)).collect(Collectors.toList());
    }








}
