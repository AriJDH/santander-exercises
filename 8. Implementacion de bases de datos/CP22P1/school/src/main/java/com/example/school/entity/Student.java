package com.example.school.entity;

import javax.persistence.*;

@Entity
@Table(name = "estudiantes")
public class Student {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "documento")
    private String dni;

    @Column(name = "nombre")
    private String name;

}
