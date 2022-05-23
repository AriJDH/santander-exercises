package com.example.showroom.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClothSaleRequestDTO {
    private Integer cloth_id;
    private Integer quantity;
}
