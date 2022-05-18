package com.LasPerlas.service;

import com.LasPerlas.dto.response.JoyaDto;
import com.LasPerlas.entity.Joya;
import org.modelmapper.ModelMapper;
import com.LasPerlas.repository.JoyaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class JoyaService implements IJoyaService {

    @Autowired
    private JoyaRepository joyaRepository;
    ModelMapper modelMapper = new ModelMapper();

    @Override
    public List<JoyaDto> getJoyas() {

        List<Joya> joyasList = joyaRepository.findAll();
        return joyasList.stream().map(joya ->
                modelMapper.map(joya, JoyaDto.class)).collect(Collectors.toList());


    }


    @Override
    public void saveJoya(JoyaDto joyaDtoResponse) {

        Joya joya = modelMapper.map(joyaDtoResponse, Joya.class);

        joya = this.joyaRepository.save(joya);

    }
    @Override
    public JoyaDto findJoya(Long nro_identificatorio) {
        Joya joya = joyaRepository.findById(nro_identificatorio).orElseThrow(() -> {
            throw new RuntimeException("No encontramos la joya con el id solicitado");
        });
        return modelMapper.map(joya, JoyaDto.class);

    }

    @Override
    public void deleteJoya(Long nro_identificatorio) {
        Joya joya = joyaRepository.findById(nro_identificatorio).orElseThrow(() -> {
            throw new RuntimeException("No encontramos la joya con el id solicitado");
        });
        modelMapper.map(joya, JoyaDto.class);
        joya.setVentaONo(false);
        joya = this.joyaRepository.save(joya);


    }

    @Override
    public void updateJoya(Long nro_identificatorio, JoyaDto joyaDtoResponse) {
        Joya joya = joyaRepository.findById(nro_identificatorio).orElseThrow(() -> {
            throw new RuntimeException("No encontramos la joya con el id solicitado");
        });
        modelMapper.map(joya, JoyaDto.class);
        joya.setVentaONo(joyaDtoResponse.isVentaONo());
        joya.setMaterial(joyaDtoResponse.getMaterial());
        joya.setNombre(joyaDtoResponse.getNombre());
        joya.setParticularidad(joyaDtoResponse.getParticularidad());
        joya.setPosee_piedra(joyaDtoResponse.isPosee_piedra());
        joya.setPeso(joyaDtoResponse.getPeso());
        joya = this.joyaRepository.save(joya);



    }
}
