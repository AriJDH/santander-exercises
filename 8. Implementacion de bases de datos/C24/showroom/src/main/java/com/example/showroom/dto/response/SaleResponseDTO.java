package com.example.showroom.dto.response;

import com.example.showroom.dto.request.ClothRequestDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaleResponseDTO {
    private Integer id;
    private LocalDate date;
    private Double total;
    private String paymentMethod;
    private List<ClothRequestDTO> clothes;
}
