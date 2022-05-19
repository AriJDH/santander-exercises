package com.santanderbootcamp.joyeria.mapper;

import com.santanderbootcamp.joyeria.dto.JoyaDTO;
import com.santanderbootcamp.joyeria.model.Joya;

public class JoyaMapper implements IMapperDTO<Joya, JoyaDTO> {
    @Override
    public JoyaDTO toDto(Joya joya) {
        JoyaDTO joyaDTO = new JoyaDTO();
        joyaDTO.setNombre(joya.getNombre());
        joyaDTO.setMaterial(joya.getMaterial());
        joyaDTO.setPeso(joya.getPeso());
        joyaDTO.setParticularidad(joyaDTO.getParticularidad());
        joyaDTO.setPosee_piedra(joya.getPosee_piedra());
        joyaDTO.setVentaONo(joya.getVentaONo());
        return joyaDTO;
    }

    @Override
    public Joya dtoTo(JoyaDTO joyaDTO) {
        Joya joya = new Joya();
        joya.setNombre(joyaDTO.getNombre());
        joya.setMaterial(joyaDTO.getMaterial());
        joya.setPeso(joyaDTO.getPeso());
        joya.setParticularidad(joyaDTO.getParticularidad());
        joya.setPosee_piedra(joyaDTO.getPosee_piedra());
        joya.setVentaONo(joyaDTO.getVentaONo());
        return joya;
    }
}
