package com.example.school.entity;


import javax.persistence.*;

@Entity
@Table(name = "materias")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nombre", length = 50)
    private String nombre;
}
