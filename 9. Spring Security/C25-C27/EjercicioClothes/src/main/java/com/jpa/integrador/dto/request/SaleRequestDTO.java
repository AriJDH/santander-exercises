package com.jpa.integrador.dto.request;

import com.jpa.integrador.entity.Cloth;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaleRequestDTO {
    private Integer id;

    private LocalDate date;

    private Double totalAmount;

    private String paymentMethod;

    private List<ClothRequestDTO> cloth;
}
