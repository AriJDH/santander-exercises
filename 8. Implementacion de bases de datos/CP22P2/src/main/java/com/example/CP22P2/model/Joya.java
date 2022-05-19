package com.example.CP22P2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "joyaa")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class Joya {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "material")
    private String material;
    @Column(name = "peso")
    private Double peso;
    @Column(name = "particularidad")
    private String particularidad;
    @Column(name = "tiene_piedra")
    private Boolean posee_piedra;
    @Column(name = "vendido")
    private Boolean ventaONo;

}
