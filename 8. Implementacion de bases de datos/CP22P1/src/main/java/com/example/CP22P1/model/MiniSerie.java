package com.example.CP22P1.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "MiniSeries")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MiniSerie {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column
    private String name;
    @Column
    private Double rating;
    @Column
    private int amountOfAwards;

}
