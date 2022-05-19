package com.jpa.school.controller;

import com.jpa.school.dto.CourseDTO;
import com.jpa.school.dto.StudentDTO;
import com.jpa.school.dto.SuccessDTO;
import com.jpa.school.dto.response.StudentResponseDTO;
import com.jpa.school.service.SchoolService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;

@RestController
public class SchoolController {

    @Autowired
    SchoolService schoolService;

    @PostMapping("/student")
    public ResponseEntity<SuccessDTO> addStudent(@RequestBody StudentDTO student){
        if(this.schoolService.addStudent(student)){
            return ResponseEntity.ok()
                    .body(new SuccessDTO("Se ha creado el alumno", HttpStatus.CREATED.value()));
            // new ResponseEntity<SuccessDTO>(
            // new SuccessDTO("Se ha creado el alumno", HttpStatus.CREATED.value()), HttpStatus.ACCEPTED);
        }
        else
            throw new RuntimeException();
    }

    @PatchMapping("/student")
    public ResponseEntity<SuccessDTO> updateStudent(@RequestBody StudentDTO student){
        if(this.schoolService.updateStudent(student)){
            return ResponseEntity.ok()
                    .body(new SuccessDTO("Se ha creado el alumno", HttpStatus.CREATED.value()));
            }
        else
            throw new RuntimeException();
    }

    @PostMapping("/course")
    public ResponseEntity<SuccessDTO> addCourse(@RequestBody CourseDTO courseDTO){
        SuccessDTO successDTO = this.schoolService.addCourse(courseDTO);
        return ResponseEntity.ok().body(successDTO);
    }

    @GetMapping("/student")
    public ResponseEntity<List<StudentResponseDTO>> listStudents(){
        return ResponseEntity.ok().body(schoolService.findAllStudents());
    }

    @GetMapping("/student/{idStudent}")
    public ResponseEntity<StudentResponseDTO> getStudentById(@PathVariable Integer idStudent){
        return ResponseEntity.ok().body(schoolService.findOneStudent(idStudent));
    }

    @DeleteMapping("/student/{idStudent}")
    public ResponseEntity<SuccessDTO> deleteStudent(@PathVariable Integer idStudent){
        return ResponseEntity.ok().body(schoolService.deleteStudent(idStudent));
    }

    @GetMapping("/student/findbyname/{name}")
    public ResponseEntity<List<StudentResponseDTO>> findByName (@PathVariable String name){
        return ResponseEntity.ok().body(schoolService.findByName(name));
    }

    @GetMapping("/student/findbydisabled")
    public ResponseEntity<List<StudentResponseDTO>> findByDisabled (){
        return ResponseEntity.ok().body(schoolService.findByDisable());
    }
}
