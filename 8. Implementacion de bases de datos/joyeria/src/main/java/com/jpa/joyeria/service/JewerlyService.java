package com.jpa.joyeria.service;

import com.jpa.joyeria.dto.JoyaDTO;
import com.jpa.joyeria.dto.SuccessDTO;
import com.jpa.joyeria.dto.response.JoyaResponseDTO;
import com.jpa.joyeria.entity.Joya;
import com.jpa.joyeria.repository.JoyaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class JewerlyService {

    @Autowired
    JoyaRepository joyaRepository;
    ModelMapper modelMapper = new ModelMapper();

    public boolean addJoya(JoyaDTO joyaDTO){
        Joya joya = modelMapper.map(joyaDTO, Joya.class);

        joya = this.joyaRepository.save(joya);

        if(joya.getNro_identificatorio() != null) return true; else return false;
    }

    public List<JoyaResponseDTO> findAllJoyas(){
        List<Joya> joyaList = joyaRepository.findAll();
        return joyaList.stream()
                .map(joya ->
                        modelMapper.map(joya, JoyaResponseDTO.class)).collect(Collectors.toList());
    }
    public JoyaResponseDTO findOneStudent(Integer idJoya){
        Joya joya =
                joyaRepository.findById(idJoya).orElseThrow(() -> {throw new RuntimeException("No existe esa joya");});

        return  modelMapper.map(joya, JoyaResponseDTO.class);

    }
    public SuccessDTO deleteJoya(Integer idJoya){
        joyaRepository.deleteById(idJoya);

        Optional<Joya> joya = joyaRepository.findById(idJoya);

        if(joya.isEmpty())
            return new SuccessDTO("Se ha eliminado la joya con exito", HttpStatus.OK.value());
        else
            throw new RuntimeException();
    }
    public List<JoyaResponseDTO> findByName(String name){
        List<Joya> listJoya = joyaRepository.findJoyaByNombreEquals(name);

        return listJoya.stream()
                .map(student ->
                        modelMapper.map(student, JoyaResponseDTO.class)).collect(Collectors.toList());
    }
    public List<JoyaResponseDTO> findByDisable(){
        List<Joya> listJoya = joyaRepository.findJoyaByVentaONoIsTrue();

        return listJoya.stream()
                .map(joya ->
                        modelMapper.map(joya, JoyaResponseDTO.class)).collect(Collectors.toList());
    }

    public JoyaResponseDTO actualizar(JoyaDTO joyaDTO) {
        Joya joya = new Joya(joyaDTO.getNombre(), joyaDTO.getMaterial(),joyaDTO.getPeso(),joyaDTO.getParticularidad(),joyaDTO.getVentaONo());
        return null;
    }
}
