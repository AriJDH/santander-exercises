package com.jpa.school.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "cursos")
public class Course {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "nombre")
    private String name;

    //si no le pones mappyedBy, se genera una tabla intermedia
    // tenemos que delegarle
    @OneToMany(mappedBy = "course")
    private Set<Student> student;
}
