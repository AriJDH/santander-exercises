package com.santanderbootcamp.joyeria.dto.response;

import com.santanderbootcamp.joyeria.dto.StatusDTO;
import com.santanderbootcamp.joyeria.model.Joya;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponseActualizarJoyaDTO {
    private Joya joya;
    private StatusDTO status;
}
