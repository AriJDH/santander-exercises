package com.bootcamp.practicaStarWars.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Personaje {

    String name, height, mass;
    String hair_color, skin_color, eye_color, birth_year, gender, homeworld, species;
}
