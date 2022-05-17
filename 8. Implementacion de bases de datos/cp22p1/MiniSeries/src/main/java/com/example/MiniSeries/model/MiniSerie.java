package com.example.MiniSeries.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "miniseries")
public class MiniSerie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre")
    private String name;
    @Column(name = "rating")
    private double rating;
    @Column(name = "cantidad_premios")
    private int amount_awards;


}
