package com.example.school.entity;

import javax.persistence.*;

@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer id;
    @Column(name = "nombre")
    private String nombre;
}
