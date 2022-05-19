package com.bootcamp.HibernateProject.model;

import javax.persistence.*;

@Entity
@Table(name = "subjects")
public class Subject {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(length = 50)
    private String name;


}
