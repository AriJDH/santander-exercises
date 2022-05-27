package com.jpa.integrador.dto.response;

import com.jpa.integrador.dto.request.ClothRequestDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaleResponseDTO {
    private Integer id;

    private LocalDate date;

    private Double totalAmount;

    private String paymentMethod;

    private List<ClothRequestDTO> cloth;
}
