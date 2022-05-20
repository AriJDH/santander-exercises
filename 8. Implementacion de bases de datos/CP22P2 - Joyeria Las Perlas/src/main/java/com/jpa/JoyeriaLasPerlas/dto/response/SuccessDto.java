package com.jpa.JoyeriaLasPerlas.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jpa.JoyeriaLasPerlas.dto.RespuestaDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SuccessDto {


    @JsonProperty("Response")
    private RespuestaDto respuestaDto;

    @JsonProperty("Joya")
    private JoyaDtoResponse joyaDtoResponse;
}
