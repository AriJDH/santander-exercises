package com.example.showroom.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClothRequestDTO {
    private Integer id;
    private String name;
    private String type;
    private String brand;
    private String color;
    private String size;
    private Integer quantity;
    private Double salePrice;
}
