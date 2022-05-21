package com.santander.Joyeria.service;

import com.santander.Joyeria.dto.RespuestaDTO;
import com.santander.Joyeria.dto.request.JoyaDTORequest;
import com.santander.Joyeria.dto.response.JoyaDTOResponse;
import com.santander.Joyeria.dto.response.SuccessDTO;
import com.santander.Joyeria.entity.Joya;
import com.santander.Joyeria.exception.JoyaNoExisteException;
import com.santander.Joyeria.repository.IJoyaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class JoyaService {

    @Autowired
    IJoyaRepository iJoyaRepository;
    ModelMapper modelMapper = new ModelMapper();

    public SuccessDTO newJoya(JoyaDTORequest joyaDTORequest) {
        Joya joya =  modelMapper.map(joyaDTORequest, Joya.class);
        iJoyaRepository.save(joya);
        JoyaDTOResponse joyaDTOResponse = modelMapper.map(joya, JoyaDTOResponse.class);

        RespuestaDTO respuestaDTO = new RespuestaDTO(HttpStatus.CREATED.value(),"El id de la nueva joya es:" + joyaDTOResponse.getId());
        SuccessDTO successDTO = new SuccessDTO(respuestaDTO,joyaDTOResponse);
        return successDTO;
    }

    public List<JoyaDTOResponse> getJoyas() {
        List<Joya> listJoyas = iJoyaRepository.findJoyaByVentaONoIsTrue();
        return listJoyas.stream().map(joya -> modelMapper.map(joya, JoyaDTOResponse.class)).collect(Collectors.toList());
    }

    public RespuestaDTO deleteJoya(Integer idJoya) {
        Optional<Joya> joya = iJoyaRepository.findById(idJoya);
        if(joya.isEmpty())
            throw new JoyaNoExisteException();
        else{
            joya.get().setVentaONo(false);
            iJoyaRepository.save(joya.get());
            return new RespuestaDTO(HttpStatus.OK.value(),"Se ha eliminado la joya con id número: " + idJoya
            );
        }
    }

    public SuccessDTO updateJoya(Integer id, JoyaDTORequest joyaDTORequest) {
        Optional<Joya> joya = iJoyaRepository.findById(id);
        if (joya.isEmpty())
            throw new JoyaNoExisteException();
        else {
            joya.get().setNombre(joyaDTORequest.getNombre());
            joya.get().setMaterial(joyaDTORequest.getMaterial());
            joya.get().setPeso(joyaDTORequest.getPeso());
            joya.get().setParticularidad(joyaDTORequest.getParticularidad());
            joya.get().setPoseePiedra(joyaDTORequest.getPoseePiedra());
            joya.get().setVentaONo(joyaDTORequest.getVentaONo());
            iJoyaRepository.save(joya.get());
            JoyaDTOResponse joyaResponse = modelMapper.map(joya.get(), JoyaDTOResponse.class);


            SuccessDTO successDto = new SuccessDTO(new RespuestaDTO(HttpStatus.OK.value()
                    , "Se ha modificado la joya con numero identificatorio: " + id), joyaResponse);
            return successDto;
        }
    }
}
