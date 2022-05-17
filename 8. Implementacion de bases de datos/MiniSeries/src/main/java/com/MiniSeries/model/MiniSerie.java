package com.MiniSeries.model;

import lombok.Getter;
import lombok.Setter;

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
    private String name;
    private double rating;
    int amount_of_awards;

}
