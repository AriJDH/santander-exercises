package com.example.sorteo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TopicResponseDTO {
    private Integer id;
    private String topicName;
    private String complexity;
}
