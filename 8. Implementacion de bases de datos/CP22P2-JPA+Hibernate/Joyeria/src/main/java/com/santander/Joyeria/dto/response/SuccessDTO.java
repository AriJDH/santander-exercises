package com.santander.Joyeria.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.santander.Joyeria.dto.RespuestaDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class SuccessDTO {

    @JsonProperty("Response")
    private RespuestaDTO respuestaDTO;

    @JsonProperty("Joya")
    private JoyaDTOResponse joyaDTOResponse;
}
