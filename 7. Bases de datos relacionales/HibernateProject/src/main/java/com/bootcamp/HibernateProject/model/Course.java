package com.bootcamp.HibernateProject.model;

import javax.persistence.*;

@Entity
@Table(name = "courses")
public class Course {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private Integer id;

    @Column
    private String name;
}
