package com.example.showroom.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Cloth {
    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private String name;
    @Column
    private String type;
    @Column
    private String brand;
    @Column
    private String color;
    @Column
    private String size;
    @Column
    private Integer quantity;
    @Column
    private Double salePrice;

    @OneToMany(mappedBy = "cloth")
    private List<ClothSale> clothSale;
}
