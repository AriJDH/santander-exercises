package com.bootcamp.C23P1.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private String dni;
    @Column
    private String curso;


    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "idTema", referencedColumnName = "id")
    private Tema tema;

}
