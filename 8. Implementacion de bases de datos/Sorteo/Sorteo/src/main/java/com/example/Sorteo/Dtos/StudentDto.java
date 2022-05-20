package com.example.Sorteo.Dtos;

import com.example.Sorteo.Models.Topic;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
    Integer id;
    String name;
    String surname;
    String dni;
    String course;
    TopicDto topic;

}
