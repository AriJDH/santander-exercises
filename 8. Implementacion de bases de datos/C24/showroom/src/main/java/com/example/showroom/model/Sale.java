package com.example.showroom.model;

import com.example.showroom.dto.request.ClothRequestDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
    //@Column
    //private List<Cloth> clothes;
}
