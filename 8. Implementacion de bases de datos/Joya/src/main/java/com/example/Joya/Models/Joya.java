package com.example.Joya.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "jewerly")
public class Joya {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Integer nro_identificatorio;
    @Column(name = "nombre")
    String nombre;
    @Column(name = "material")
    String material;
    @Column(name = "peso")
    int peso;
    @Column(name = "particularidad")
    String particularidad;
    @Column(name = "posee_piedra")
    Boolean posee_piedra;
    @Column(name = "venta_O_No")
    Boolean ventaONo;

}
