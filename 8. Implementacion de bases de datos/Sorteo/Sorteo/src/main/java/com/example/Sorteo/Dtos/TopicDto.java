package com.example.Sorteo.Dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class TopicDto {
    Long id;
    String topic_name;
    String complexity;
}
