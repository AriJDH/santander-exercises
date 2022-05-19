package com.santanderbootcamp.joyeria.service;

import com.santanderbootcamp.joyeria.dto.JoyaDTO;
import com.santanderbootcamp.joyeria.dto.StatusDTO;
import com.santanderbootcamp.joyeria.dto.response.ResponseActualizarJoyaDTO;
import com.santanderbootcamp.joyeria.dto.response.ResponseListaJoyasDTO;

public interface IJoyeriaService {
    public StatusDTO crear(JoyaDTO joya);

    public ResponseListaJoyasDTO obtenerListado();

    public ResponseListaJoyasDTO eliminar(Integer id);

    public ResponseActualizarJoyaDTO actualizar(Integer id, JoyaDTO joya);
}
