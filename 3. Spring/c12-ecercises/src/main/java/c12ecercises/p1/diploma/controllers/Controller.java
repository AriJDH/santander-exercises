package c12ecercises.p1.diploma.controllers;

import c12ecercises.p1.diploma.AppApplication;
import c12ecercises.p1.diploma.models.Student;
import c12ecercises.p1.diploma.services.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.InvalidParameterException;
import java.util.List;

@RestController
public class Controller {

    StudentService studentService = new StudentService();
    Logger LOGGER = LoggerFactory.getLogger(AppApplication.class);

    @GetMapping("/getStudents")
    public ResponseEntity<List<Student>> getStudents() {

        return new ResponseEntity<>(studentService.getStudents(), HttpStatus.OK);
    }

    @GetMapping("/getStudent/{name}")
    public ResponseEntity<Student> getStudent(@PathVariable String name) {

        Student s;
        try {
            s = studentService.getStudent(name);
        } catch (Exception InvalidParameterException) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>(s, HttpStatus.OK);
    }

    @GetMapping("/average/{name}")
    public ResponseEntity<String> getAverage(@PathVariable String name) {

        double average = 0;
        try {
            average = studentService.getAverage(name);
        } catch (Exception InvalidParameterException) {
            return new ResponseEntity<>("This student doesn't exist", HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>(String.valueOf(average), HttpStatus.OK);
    }

    @PostMapping("/addStudent")
    public ResponseEntity<String> addStudent(@RequestBody Student s) {
        studentService.addStudent(s);

        LOGGER.info(String.valueOf(s));
        return new ResponseEntity<>("Student added.", HttpStatus.CREATED);
    }

}
