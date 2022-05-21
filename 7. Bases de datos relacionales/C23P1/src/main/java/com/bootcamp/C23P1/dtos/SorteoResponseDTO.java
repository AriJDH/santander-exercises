package com.bootcamp.C23P1.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SorteoResponseDTO {

    List<AlumnoDTO> alumnoDTOList = new ArrayList<>();

}
