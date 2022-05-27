package com.jpa.integrador.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "prenda")
public class Cloth {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(name = "nombre")
    private String name;
    @Column(name = "marca")
    private String brand;
    @Column(name = "color")
    private String color;
    @Column(name = "talle")
    private String size;
    @Column(name = "cantidad")
    private Integer quantity;
    @Column(name = "precio_venta")
    private Double salePrice;


}
