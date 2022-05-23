package com.example.showroom.model;

import com.example.showroom.dto.request.ClothRequestDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Entity
public class Sale {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private LocalDate date;

    @Column
    private Double total;

    @Column
    private String paymentMethod;

    @OneToMany(mappedBy = "sale"
    , cascade = CascadeType.PERSIST)
    private List<ClothSale> clothSales;
}
