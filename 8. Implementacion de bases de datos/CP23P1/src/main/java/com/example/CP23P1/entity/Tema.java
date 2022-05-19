package com.example.CP23P1.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "tema")
public class Tema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column
    private String tema_nombre;

    @Column
    private String complejidad;


    @OneToMany(mappedBy = "tema")
    private Set<Alumno> alumno;

}
