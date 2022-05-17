package com.LasPerlas.service;

import com.LasPerlas.dto.response.JoyaDtoResponse;
import com.LasPerlas.dto.response.MessageDto;
import com.LasPerlas.entity.Joya;
import org.modelmapper.ModelMapper;
import com.LasPerlas.repository.JoyaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class JoyaService implements  IJoyaService{

    @Autowired
    private JoyaRepository joyaRepository;
    ModelMapper modelMapper = new ModelMapper();

    @Override
    public List<JoyaDtoResponse> getJoyas() {

        List<Joya> joyasList = joyaRepository.findAll();
        return joyasList.stream().map(joya ->
                modelMapper.map(joya, JoyaDtoResponse.class)).collect(Collectors.toList());
    }

    @Override
    public void saveJoya(JoyaDtoResponse joyaDtoResponse) {

        Joya joya = modelMapper.map(joyaDtoResponse, Joya.class);

        joya = this.joyaRepository.save(joya);

    }

    @Override
    public MessageDto deleteJoya(long id) {
        joyaRepository.deleteById(id);
        Optional<Joya> joya  = joyaRepository.findById(id);
        if(joya.isEmpty())
            return new MessageDto("Se elimino correctamente");
        else{
            throw new RuntimeException("No se pudo eliminar el registro solicitado");
        }

    }

    @Override
    public JoyaDtoResponse findJoya(long id) {
      Joya joya = joyaRepository.findById(id).orElseThrow(()-> {throw new RuntimeException("No encontramos la joya con el id solicitado");});
              return modelMapper.map(joya, JoyaDtoResponse.class);

    }
}
