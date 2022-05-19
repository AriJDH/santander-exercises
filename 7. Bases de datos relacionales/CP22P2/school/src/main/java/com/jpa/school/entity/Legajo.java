package com.jpa.school.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class Legajo {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "codigo")
    private String code;

    @OneToOne(mappedBy = "legajo")
    private Student student;

}
