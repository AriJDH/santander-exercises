package com.example.sorteo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentDTO {
    private String name;
    private String surname;
    private String dni;
    private String course;
    private TopicIdDTO topicIdDTO;
}
