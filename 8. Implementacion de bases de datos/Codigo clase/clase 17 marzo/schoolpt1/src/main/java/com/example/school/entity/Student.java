package com.example.school.entity;

import org.springframework.web.bind.annotation.ControllerAdvice;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "documento") //si no le pones name toma el nombre del atributo
    private String dni;
    @Column(name = "name")
    private String name;


}
