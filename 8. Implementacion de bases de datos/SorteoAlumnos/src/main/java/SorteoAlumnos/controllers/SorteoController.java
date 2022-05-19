package SorteoAlumnos.controllers;

import SorteoAlumnos.dtos.StudentDTO;
import SorteoAlumnos.dtos.SuccessDto;
import SorteoAlumnos.dtos.TopicDTO;
import SorteoAlumnos.services.SorteoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

@RestController
public class SorteoController {

    @Autowired
    SorteoService sorteoService;

    @PostMapping("/students")
    public ResponseEntity<SuccessDto> addStudent(@RequestBody StudentDTO student){
        if(this.sorteoService.addStudent(student)){
            return ResponseEntity.ok()
                    .body(new SuccessDto("Student created", HttpStatus.CREATED.value()));
        }
        else
            throw new RuntimeException();
    }

    @PostMapping("/topics")
    public ResponseEntity<SuccessDto> addTopic(@RequestBody TopicDTO topic) {
        if(this.sorteoService.addTopic(topic)){
            return ResponseEntity.ok()
                    .body(new SuccessDto("Topic created", HttpStatus.CREATED.value()));
        }
        else
            throw new RuntimeException();
    }

    @GetMapping("/students")
    public ResponseEntity<List<StudentDTO>> getStudents() {
        return ResponseEntity.ok().body(sorteoService.getStudents());
    }

    @GetMapping("/topics")
    public ResponseEntity<List<TopicDTO>> getTopics() {
        return ResponseEntity.ok().body(sorteoService.getTopics());
    }

    @GetMapping("/students/draw")
    public ResponseEntity<?> getDraw() {

        return ResponseEntity.ok().body(sorteoService.getDraw());
    }

}
