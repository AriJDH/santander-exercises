package com.santanderbootcamp.joyeria.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name = "joya")
public class Joya {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "material")
    private String material;
    @Column(name = "peso")
    private Integer peso;
    @Column(name = "particularidad")
    private String particularidad;
    @Column(name = "posee_piedra")
    private Boolean posee_piedra;
    @Column(name = "ventaONo")
    private Boolean ventaONo;
}
