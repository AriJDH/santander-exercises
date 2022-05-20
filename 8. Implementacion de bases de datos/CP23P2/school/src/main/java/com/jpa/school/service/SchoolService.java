package com.jpa.school.service;

import com.jpa.school.dto.CourseDTO;
import com.jpa.school.dto.StudentDTO;
import com.jpa.school.dto.SuccessDTO;
import com.jpa.school.dto.response.StudentResponseDTO;
import com.jpa.school.entity.Course;
import com.jpa.school.entity.Legajo;
import com.jpa.school.entity.Student;
import com.jpa.school.repository.CourseRepository;
import com.jpa.school.repository.StudentsRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SchoolService {

    @Autowired
    StudentsRepository studentsRepository;

    @Autowired
    CourseRepository courseRepository;
    ModelMapper modelMapper = new ModelMapper();

    public boolean addStudent(StudentDTO studentDTO){
        Student student = modelMapper.map(studentDTO, Student.class);
        // el mapper mapea mal el legajo asi que tenemos que setearselo a mano
        student.setLegajo(modelMapper.map(studentDTO.getLegajo(), Legajo.class));

        // si ya existe el curso lo obtengo de la BD y le seteo el student
        Optional<Course> course = Optional.empty();
        if(studentDTO.getCourse().getId() != null){
            course = courseRepository.findById(studentDTO.getCourse().getId());
            if(course.isPresent()){
                student.setCourse(course.get());
            }
        }

        student =  this.studentsRepository.save(student);

        return (student.getId() != null);
    }

    public boolean updateStudent(StudentDTO studentDTO){
        Student student = modelMapper.map(studentDTO, Student.class);
        student.setCourse(courseRepository.findCourseByStudentEquals(student));
        //student.setLegajo(modelMapper.map(studentDTO.getLegajo(), Legajo.class));

        student =  this.studentsRepository.save(student);


        return student.getId() != null;
    }

    public SuccessDTO addCourse(CourseDTO courseDTO){
        Course course = modelMapper.map(courseDTO, Course.class);

        course =  this.courseRepository.save(course);

        if(course.getId() == null){
            throw new RuntimeException();
        }

        return new SuccessDTO("Se ha creado el curso con id " + course.getId(), HttpStatus.CREATED.value());

    }

    public List<StudentResponseDTO> findAllStudents(){
        List<Student> studentList = studentsRepository.findAll();
        return studentList.stream()
                .map(student ->
                        modelMapper.map(student, StudentResponseDTO.class)).collect(Collectors.toList());
    }

    public StudentResponseDTO findOneStudent(Integer idStudent){
        Student student =
                studentsRepository.findById(idStudent).orElseThrow(() -> {throw new RuntimeException("No existe ese estudiante");});

        return  modelMapper.map(student, StudentResponseDTO.class);
    }

    public SuccessDTO deleteStudent(Integer idStudent){
        studentsRepository.deleteById(idStudent);

        Optional<Student> student = studentsRepository.findById(idStudent);

        if(student.isEmpty())
            return new SuccessDTO("Se ha eliminado con exito el alumno", HttpStatus.OK.value());
        else
            throw new RuntimeException();
    }

    public List<StudentResponseDTO> findByName(String name){
        List<Student> listStudent = studentsRepository.findStudentByNameEquals(name);

        return listStudent.stream()
                .map(student ->
                        modelMapper.map(student, StudentResponseDTO.class)).collect(Collectors.toList());
    }

    public List<StudentResponseDTO> findByDisable(){
        List<Student> listStudent = studentsRepository.findStudentByDisabledIsTrue();

        return listStudent.stream()
                .map(student ->
                        modelMapper.map(student, StudentResponseDTO.class)).collect(Collectors.toList());
    }
}
