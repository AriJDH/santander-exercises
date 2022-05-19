package com.santander.bootcamp.M9C22P2.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "joyas")
@NoArgsConstructor
@Getter
@Setter
public class Joya {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nro_identificatorio;

    @Column
    private String nombre;

    @Column
    private String material;

    @Column
    private Double peso;

    @Column
    private String particularidad;

    @Column
    private Boolean posee_piedra;

    @Column
    private Boolean ventaONo;

}
