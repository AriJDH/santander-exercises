package com.santanderbootcamp.joyeria.service;

import com.santanderbootcamp.joyeria.dto.JoyaDTO;
import com.santanderbootcamp.joyeria.dto.StatusDTO;
import com.santanderbootcamp.joyeria.exception.JewerlyException;
import com.santanderbootcamp.joyeria.mapper.IMapperDTO;
import com.santanderbootcamp.joyeria.mapper.JoyaMapper;
import com.santanderbootcamp.joyeria.model.Joya;
import com.santanderbootcamp.joyeria.dto.response.ResponseActualizarJoyaDTO;
import com.santanderbootcamp.joyeria.dto.response.ResponseListaJoyasDTO;
import com.santanderbootcamp.joyeria.repository.JoyeriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class JoyeriaService implements IJoyeriaService {

    @Autowired
    JoyeriaRepository joyeria;

    IMapperDTO<Joya, JoyaDTO> mapper = new JoyaMapper();

    @Override
    public StatusDTO crear(JoyaDTO joyaDTO) {
        Joya joya = mapper.dtoTo(joyaDTO);

        joyeria.save(joya);

        if(joya.getId() != null) return new StatusDTO(200, "La joya se ha creado con el id: " + joya.getId());
        else throw new JewerlyException("No se pudo crear la joya");
    }

    @Override
    public ResponseListaJoyasDTO obtenerListado() {
        ResponseListaJoyasDTO listaJoyasDTO = new ResponseListaJoyasDTO();
        List<Joya> listaJoyas = joyeria.findAll();
        listaJoyasDTO.setJoyas(listaJoyas.stream().filter(Joya::getVentaONo).collect(Collectors.toList()));
        return listaJoyasDTO;
    }

    @Override
    public ResponseListaJoyasDTO eliminar(Integer id) {
        Joya joya = joyeria.findById(id).orElse(null);
        if(joya != null) {
            joya.setVentaONo(false);
            joyeria.save(joya);
        }
        return obtenerListado();
    }

    @Override
    public ResponseActualizarJoyaDTO actualizar(Integer id, JoyaDTO joyaDTO) {
        Joya joya = joyeria.findById(id).orElse(null);
        if(joya == null) throw new JewerlyException("No se encuentra una joya con ese id");

        Joya joyaActualizada = mapper.dtoTo(joyaDTO);
        joyaActualizada.setId(id);
        joyeria.save(joyaActualizada);

        ResponseActualizarJoyaDTO response = new ResponseActualizarJoyaDTO();
        response.setJoya(joyaActualizada);
        response.setStatus(new StatusDTO(200, "Se actualizo la joya"));

        return response;
    }
}
