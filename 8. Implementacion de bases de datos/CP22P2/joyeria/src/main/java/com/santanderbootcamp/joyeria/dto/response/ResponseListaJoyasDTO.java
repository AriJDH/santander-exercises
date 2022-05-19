package com.santanderbootcamp.joyeria.dto.response;

import com.santanderbootcamp.joyeria.model.Joya;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponseListaJoyasDTO {
    private List<Joya> joyas;
}
