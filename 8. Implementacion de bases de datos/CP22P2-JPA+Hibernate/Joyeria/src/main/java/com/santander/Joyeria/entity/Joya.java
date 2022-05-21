package com.santander.Joyeria.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "joyas")
public class Joya {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre", length = 50)
    private String nombre;

    @Column(name = "material", length = 15)
    private String material;

    @Column(name = "peso")
    private Double peso;

    @Column(name = "particularidad")
    private String particularidad;

    @Column(name = "poseePiedra")
    private Boolean poseePiedra;

    @Column(name = "ventaONo")
    private Boolean ventaONo;
}
