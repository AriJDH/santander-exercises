package com.example.sorteo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentTopicDTO {
    private String name;
    private String surname;
    private TopicDTO topicDTO;
}
