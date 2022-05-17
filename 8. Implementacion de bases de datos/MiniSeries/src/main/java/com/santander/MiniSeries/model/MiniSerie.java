package com.santander.MiniSeries.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter

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

    public MiniSerie(Long id, String name, Double rating, Integer amount_of_awards) {
        this.id = id;
        this.name = name;
        this.rating = rating;
        this.amount_of_awards = amount_of_awards;
    }
}
