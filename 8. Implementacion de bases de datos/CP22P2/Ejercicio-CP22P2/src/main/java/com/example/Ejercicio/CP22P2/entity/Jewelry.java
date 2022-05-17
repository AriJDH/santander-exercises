package com.example.Ejercicio.CP22P2.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "joyas")
@Getter
@Setter
public class Jewelry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nro_identificatorio")
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "material")
    private String material;

    @Column(name = "peso")
    private double weight;

    @Column(name = "particularidad")
    private String characteristics;

    @Column(name = "posee_piedra")
    private Boolean has_it;

    @Column(name = "ventaONo")
    private Boolean isForSale;


}
