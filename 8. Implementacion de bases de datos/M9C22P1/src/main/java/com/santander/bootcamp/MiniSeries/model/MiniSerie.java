package com.santander.bootcamp.MiniSeries.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class MiniSerie {

    @Id
    @GeneratedValue
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
