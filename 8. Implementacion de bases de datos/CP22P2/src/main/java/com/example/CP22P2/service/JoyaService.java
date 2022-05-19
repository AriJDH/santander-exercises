package com.example.CP22P2.service;

import com.example.CP22P2.dto.JoyaDto;
import com.example.CP22P2.dto.RespuestaDto;
import com.example.CP22P2.model.Joya;
import com.example.CP22P2.repo.IJoyaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class JoyaService {
    @Autowired
    IJoyaRepository joyaRepository;
    ModelMapper modelMapper = new ModelMapper();

    public RespuestaDto añadirJoya(JoyaDto joyaDto) {
        Joya joya = modelMapper.map(joyaDto,Joya.class);
        joya.setVentaONo(true);
        joya = this.joyaRepository.save(joya);
        if(joya.getId() == null){
            throw new RuntimeException();
        }
        return new RespuestaDto("Se agrego correctamente",200);
    }

    public List<JoyaDto> obtenerJoyas() {
        List<Joya> joyas =  joyaRepository.findAll();
        List<JoyaDto> joyasDto = new ArrayList<>();
        System.out.println(joyas);
        for (Joya j: joyas) {
            if(j.getVentaONo()==true){
                joyasDto.add(modelMapper.map(j, JoyaDto.class));
            }
        }
        return joyasDto;
    }

    public String borrarJoya(Integer id) {
        //haremos borrado lógico, por lo cual no eliminamos el registro de la bd
        //sino que solo cambiamos su estado de verdadero (a la venta) a falso (no a la venta)
        Optional<Joya> joya = joyaRepository.findById(id);
        joya.get().setVentaONo(false);
        joyaRepository.save(joya.get());
        return "Joya borrada";
    }

    public String editarJoya(Integer id, JoyaDto joyaNueva) {

        Optional<Joya> joya = joyaRepository.findById(id);

        joya.get().setNombre(joyaNueva.getNombre());
        joya.get().setMaterial(joyaNueva.getMaterial());
        joya.get().setPeso(joyaNueva.getPeso());
        joya.get().setParticularidad(joyaNueva.getParticularidad());
        joya.get().setPosee_piedra(joyaNueva.getPosee_piedra());


        joyaRepository.save(joya.get());
        return "Joya modificada";

    }
}
