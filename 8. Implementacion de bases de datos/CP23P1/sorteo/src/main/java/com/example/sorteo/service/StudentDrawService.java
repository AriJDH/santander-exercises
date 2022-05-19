package com.example.sorteo.service;

import com.example.sorteo.dto.StudentDTO;
import com.example.sorteo.dto.SuccessDTO;
import com.example.sorteo.dto.TopicDTO;
import com.example.sorteo.model.Student;
import com.example.sorteo.model.Topic;
import com.example.sorteo.repository.StudentRepository;
import com.example.sorteo.repository.TopicRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class StudentDrawService {
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    TopicRepository topicRepository;

    ModelMapper modelMapper = new ModelMapper();

    public SuccessDTO addStudent(StudentDTO studentDTO){
        Student student = modelMapper.map(studentDTO, Student.class);
        student = studentRepository.save(student);

        if(student.getId() == null){
            throw new RuntimeException();
        }

        return new SuccessDTO("Se ha creado el estudiante con id, " + student.getId(),
                HttpStatus.CREATED.value());
    }

    public SuccessDTO addTopic(TopicDTO topicDTO) {
        Topic topic = modelMapper.map(topicDTO, Topic.class);
        topic = topicRepository.save(topic);

        if(topic.getId() == null){
            throw new RuntimeException();
        }

        return new SuccessDTO("Se ha creado el topic con id, "
                + topic.getId(),
                HttpStatus.CREATED.value());
    }
}
