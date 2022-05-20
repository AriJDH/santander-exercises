package com.example.showroom.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaleRequestDTO {
    private LocalDate date;
    private Double total;
    private String paymentMethod;
    private List<ClothRequestDTO> clothes;
}
