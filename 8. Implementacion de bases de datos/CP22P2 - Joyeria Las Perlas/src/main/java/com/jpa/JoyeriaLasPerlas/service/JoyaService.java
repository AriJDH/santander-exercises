package com.jpa.JoyeriaLasPerlas.service;

import com.jpa.JoyeriaLasPerlas.dto.RespuestaDto;
import com.jpa.JoyeriaLasPerlas.dto.response.SuccessDto;
import com.jpa.JoyeriaLasPerlas.dto.request.JoyaDtoRequest;
import com.jpa.JoyeriaLasPerlas.dto.response.JoyaDtoResponse;
import com.jpa.JoyeriaLasPerlas.entity.Joya;
import com.jpa.JoyeriaLasPerlas.exception.JoyaNoExisteException;
import com.jpa.JoyeriaLasPerlas.repository.IJoyaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class JoyaService {

    @Autowired
    IJoyaRepository iJoyaRepository;
    ModelMapper modelMapper = new ModelMapper();




    public SuccessDto newJoya(JoyaDtoRequest joyaDtoRequest) {

        Joya joya =  modelMapper.map(joyaDtoRequest, Joya.class);
        iJoyaRepository.save(joya);
        JoyaDtoResponse joyaResponse =  modelMapper.map(joya, JoyaDtoResponse.class);

        SuccessDto successDto = new SuccessDto(new RespuestaDto(HttpStatus.CREATED.value()
                ,"El número identificatorio de la nueva joya es: " + joyaResponse.getNro_identificatorio()),joyaResponse);
        return successDto;
    }



    public List<JoyaDtoResponse> getJoyas(){
        List<Joya> listaJoyas = iJoyaRepository.findJoyaByventaONoIsTrue();
        return listaJoyas.stream().map(joya -> modelMapper.map(joya, JoyaDtoResponse.class)).collect(Collectors.toList());
    }



    public RespuestaDto deleteJoya(int idJoya) {
        Optional<Joya> joya = iJoyaRepository.findById(idJoya);
        if(joya.isEmpty())
            throw new JoyaNoExisteException();
        else{
            joya.get().setVentaONo(false);
            iJoyaRepository.save(joya.get());
            return new RespuestaDto(HttpStatus.OK.value(),"Se ha eliminado la joya con numero identificatorio: " + idJoya
                    );
        }
    }

    public SuccessDto updateJoya(int idJoya, JoyaDtoRequest joyaDtoRequest) {
        Optional<Joya> joya = iJoyaRepository.findById(idJoya);
        if(joya.isEmpty())
            throw new JoyaNoExisteException();
        else{
            joya.get().setNombre(joyaDtoRequest.getNombre());
            joya.get().setMaterial(joyaDtoRequest.getMaterial());
            joya.get().setPeso(joyaDtoRequest.getPeso());
            joya.get().setParticularidad(joyaDtoRequest.getParticularidad());
            joya.get().setPosee_piedra(joyaDtoRequest.isPosee_piedra());
            joya.get().setVentaONo(joyaDtoRequest.isVentaONo());
            iJoyaRepository.save(joya.get());
            JoyaDtoResponse joyaResponse =  modelMapper.map(joya.get(), JoyaDtoResponse.class);


            SuccessDto successDto = new SuccessDto(new RespuestaDto(HttpStatus.OK.value()
                    ,"Se ha modificado la joya con numero identificatorio: " + idJoya),joyaResponse);
            return successDto;
        }

    }
}
