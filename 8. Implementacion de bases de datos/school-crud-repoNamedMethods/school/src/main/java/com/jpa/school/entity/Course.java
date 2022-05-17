package com.jpa.school.entity;

import javax.persistence.*;

@Entity
@Table(name = "cursos")
public class Course {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "nombre")
    private String name;
}
