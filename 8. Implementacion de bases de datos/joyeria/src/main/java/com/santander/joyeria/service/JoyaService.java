package com.santander.joyeria.service;

import com.santander.joyeria.dtos.request.JoyaRequestDTO;
import com.santander.joyeria.dtos.response.JoyaResponseDTO;
import com.santander.joyeria.dtos.response.SuccessDTO;
import com.santander.joyeria.models.Joya;
import com.santander.joyeria.repository.JoyaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class JoyaService {
    @Autowired
    JoyaRepository joyaRepository;
    ModelMapper modelMapper = new ModelMapper();

    /*
    public SuccessDTO addJoya(JoyaRequestDTO joyaRequestDTO){
        Joya joya = modelMapper.map(joyaRequestDTO, Joya.class);
        Joya joya2 =  this.joyaRepository.save(joya);

        if(joya2.getNumero_identificatorio() != null) {
            return new SuccessDTO(HttpStatus.OK.value(), "Se agregó la joya con número identificatorio " + joya2.getNumero_identificatorio());
        }
        else {
            throw new RuntimeException("No se pudo guardar la joya");
        }
    }
     */

    public SuccessDTO addJoya(JoyaRequestDTO joyaDto) {
        Joya joya = modelMapper.map(joyaDto, Joya.class);
        joya = this.joyaRepository.save(joya);
        System.out.println("Se agrego la joya");
        if(joya.getNumero_identificatorio() == null){
            throw new RuntimeException();
        }

        return new SuccessDTO(HttpStatus.CREATED.value(), "Se ha creado la joya, id " + joya.getNumero_identificatorio());
    }

    public List<JoyaResponseDTO> getJoyas() {
        List<Joya> joyas = joyaRepository.findJoyaByVentaONoIsFalse();
        System.out.println("Se piden todas las joyas disponibles");
        return joyas.stream().map(joya -> modelMapper.map(joya, JoyaResponseDTO.class)).collect(Collectors.toList());
    }

    public JoyaResponseDTO deleteJoya(Integer idJoya) {
        Joya joya = joyaRepository.findById(idJoya).orElseThrow(RuntimeException::new);
        if (joya.getVentaONo()) {
            throw new RuntimeException();
        }
        joya.setVentaONo(true);
        joya = joyaRepository.save(joya);
        return modelMapper.map(joya, JoyaResponseDTO.class);
    }

    public JoyaResponseDTO updateJoya(Integer idJoya, JoyaRequestDTO joyaDto) {
        Joya joya = joyaRepository.findById(idJoya).orElseThrow(RuntimeException::new);
        joya = modelMapper.map(joyaDto, Joya.class);
        joya.setNumero_identificatorio(idJoya);

        joya = joyaRepository.save(joya);

        return modelMapper.map(joya, JoyaResponseDTO.class);
    }
}
