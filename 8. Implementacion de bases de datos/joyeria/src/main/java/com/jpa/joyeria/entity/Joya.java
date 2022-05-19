package com.jpa.joyeria.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "joyas")
public class Joya {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer nro_identificatorio;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "material")
    private String material;

    @Column(name = "peso")
    private double peso;

    @Column(name = "particularidad")
    private String particularidad;

    @Column(name = "ventaONo")
    private Boolean ventaONo;


    public Joya(String nombre, String material, double peso, String particularidad, Boolean ventaONo) {
    }
}
