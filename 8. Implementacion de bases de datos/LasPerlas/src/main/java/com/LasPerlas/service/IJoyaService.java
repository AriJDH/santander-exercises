package com.LasPerlas.service;

import com.LasPerlas.dto.response.JoyaDto;

import java.util.List;

public interface IJoyaService {

    public List<JoyaDto> getJoyasByventaONoTrue();
    public List<JoyaDto> getAllJoyas();
    public void saveJoya (JoyaDto joyaDtoResponse);
    public void deleteJoya(Long nro_identificatorio);
    public JoyaDto findJoya(Long nro_identificatorio);
    public void updateJoya(Long nro_identificatorio, JoyaDto joyaDtoResponse);
}
