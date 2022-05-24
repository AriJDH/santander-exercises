package com.jpa.integrador.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClothesResponseDTO {

    private Integer id;
    private String name;
    private String brand;
    private String color;
    private String size;
    private Integer quantity;
    private Double salePrice;
}
