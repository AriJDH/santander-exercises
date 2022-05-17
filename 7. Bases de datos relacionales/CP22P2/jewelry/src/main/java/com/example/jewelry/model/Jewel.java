package com.example.jewelry.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name = "joyas")
public class Jewel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
