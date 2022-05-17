package com.example.jewelry.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "joyas")
public class Jewel {
    @Id
    private Integer id;

    @Column
    private String name;

    @Column
    private String material;

    @Column
    private String weight;

    @Column
    private String description;

    @Column
    private Boolean hasStone;

    @Column
    private Boolean sellable;
}
