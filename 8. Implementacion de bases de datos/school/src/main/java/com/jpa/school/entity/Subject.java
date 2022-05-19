package com.jpa.school.entity;

import javax.persistence.*;

@Entity
@Table (name = "materias")
public class Subject {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "nombre", length = 50)
    private String name;

}
