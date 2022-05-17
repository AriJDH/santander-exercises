package com.example.MiniSeries.model;

import javax.persistence.*;

@Entity
public class MiniSerie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private Double rating;

    @Column
    private Integer amount_of_awards;
}
