package com.bootcamp.C23P1.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Tema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String nombre;
    @Column
    private String complejidad;

    @OneToOne(mappedBy = "tema")
    private Alumno alumno;

}
