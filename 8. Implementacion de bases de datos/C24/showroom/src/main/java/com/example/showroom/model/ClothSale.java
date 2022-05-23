package com.example.showroom.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
@Entity
public class ClothSale {
    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private Integer quantity;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="cloth_id")
    private Cloth cloth;

    @ManyToOne
    @JoinColumn(name="sale_id")
    private Sale sale;
}
