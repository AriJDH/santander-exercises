package com.example.Sorteo.Dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class TopicDto {
    Long id;
    String name_topic;
    String complejidad;

}
