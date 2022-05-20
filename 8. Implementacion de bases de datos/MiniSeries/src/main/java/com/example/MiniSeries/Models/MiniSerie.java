package com.example.MiniSeries.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "MiniSeries")
public class MiniSerie {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    Long id;
    String name;
    Double rating;
    int amount_of_awards;

}
