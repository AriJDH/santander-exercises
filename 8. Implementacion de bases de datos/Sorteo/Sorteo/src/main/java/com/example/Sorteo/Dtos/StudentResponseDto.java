package com.example.Sorteo.Dtos;

import com.example.Sorteo.Models.Topic;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentResponseDto {
    String id;

    String name;
    String surname;
    String dni;
    String course;
    Topic topic;

}
