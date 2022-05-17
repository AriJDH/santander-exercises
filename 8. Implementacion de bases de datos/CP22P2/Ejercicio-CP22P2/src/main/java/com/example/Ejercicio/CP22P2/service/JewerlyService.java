package com.example.Ejercicio.CP22P2.service;

import com.example.Ejercicio.CP22P2.dto.response.SuccessDTO;
import com.example.Ejercicio.CP22P2.dto.request.JewerlyRequestDTO;
import com.example.Ejercicio.CP22P2.dto.response.JewerlyResponseDTO;
import com.example.Ejercicio.CP22P2.dto.response.SuccessUpdateDTO;
import com.example.Ejercicio.CP22P2.entity.Jewelry;
import com.example.Ejercicio.CP22P2.repository.JewerlyRepository;
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
    JewerlyRepository jewerlyRepository;
    ModelMapper modelMapper = new ModelMapper();
    public Integer addJewerly(JewerlyRequestDTO jewerlyRequestDTO) {
        Jewelry jewelry= modelMapper.map(jewerlyRequestDTO,Jewelry.class);
        jewelry=this.jewerlyRepository.save(jewelry);
        return jewelry.getId();

    }

    public List<JewerlyResponseDTO> findAllJewerlies() {
        List<JewerlyResponseDTO> listStudentsDTO;
        List<Jewelry> studentList=jewerlyRepository.findAll();

        return studentList.stream().map(student -> modelMapper.map(student, JewerlyResponseDTO.class)).collect(Collectors.toList());
    }

    public SuccessDTO deleteJewerly(Integer idJewerly) {
        Optional<Jewelry> jewelry= jewerlyRepository.findById(idJewerly);
        if(jewelry.isEmpty()){
            throw new RuntimeException();
        }
        else{
            jewelry.get().setIsForSale(false);
            this.jewerlyRepository.save(jewelry.get());
            return new SuccessDTO("Se elimino logicamente la joya", HttpStatus.ACCEPTED.value());
        }

    }

    public SuccessUpdateDTO updateJewerly(Integer idJewerly) {
        Optional<Jewelry> jewelry= jewerlyRepository.findById(idJewerly);
        if(jewelry.isEmpty()){
            throw new RuntimeException();
        }
        else{
            jewelry.get().setCharacteristics("Otra particularidad");
            Jewelry jewelryUpdated=this.jewerlyRepository.save(jewelry.get());
            JewerlyResponseDTO jewerlyResponseDTO= modelMapper.map(jewelryUpdated,JewerlyResponseDTO.class);
            return new SuccessUpdateDTO(jewerlyResponseDTO , HttpStatus.ACCEPTED.value());
        }
    }
}
