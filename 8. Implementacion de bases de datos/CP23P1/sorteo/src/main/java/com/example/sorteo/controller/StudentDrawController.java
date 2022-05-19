package com.example.sorteo.controller;

import com.example.sorteo.dto.*;
import com.example.sorteo.dto.response.StudentResponseDTO;
import com.example.sorteo.service.StudentDrawService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentDrawController {

    @Autowired
    StudentDrawService studentDrawService;

    @PostMapping("/students")
    public ResponseEntity<SuccessDTO> addStudent(@RequestBody StudentDTO studentDTO){
        SuccessDTO successDTO = studentDrawService.addStudent(studentDTO);
        return ResponseEntity.ok().body(successDTO);
    }

    @PostMapping("/topics")
    public ResponseEntity<SuccessDTO> addTopic(@RequestBody TopicDTO topicDTO){
        SuccessDTO successDTO = studentDrawService.addTopic(topicDTO);
        return ResponseEntity.ok().body(successDTO);
    }

    @GetMapping("/students/")
    public ResponseEntity<List<StudentResponseDTO>> getStudents(){
        List<StudentResponseDTO> studentDTOs = studentDrawService.findAllStudents();
        return ResponseEntity.ok().body(studentDTOs);
    }

    @GetMapping("/topics/")
    public ResponseEntity<List<TopicResponseDTO>> getTopics(){
        List<TopicResponseDTO> topicDTOs = studentDrawService.findAllTopics();
        return ResponseEntity.ok().body(topicDTOs);
    }

    @GetMapping("students/draw")
    // TODO: crear un dto para la respuesta del draw segun enunciado
    public ResponseEntity<List<StudentTopicDTO>> draw(){
        List<StudentTopicDTO> studentsTopic = studentDrawService.draw();
        return ResponseEntity.ok().body(studentsTopic);
    }

}
