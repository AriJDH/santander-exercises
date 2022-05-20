package com.jpa.integrador.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClothesListResponseDTO {

    private List<ClothesResponseDTO> clothes;
}
