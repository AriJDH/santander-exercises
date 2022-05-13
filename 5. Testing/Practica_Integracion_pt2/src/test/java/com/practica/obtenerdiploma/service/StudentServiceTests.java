package com.practica.obtenerdiploma.service;

import com.practica.obtenerdiploma.model.StudentDTO;
import com.practica.obtenerdiploma.repository.IStudentDAO;
import com.practica.obtenerdiploma.repository.IStudentRepository;
import com.practica.obtenerdiploma.util.TestUtilsGenerator;
import org.apache.commons.collections4.CollectionUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import javax.validation.constraints.AssertTrue;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class StudentServiceTests {

    @Mock
    IStudentDAO studentDAO;
    @Mock
    IStudentRepository studentRepo;

    @InjectMocks
    StudentService service;

    @Test
    public void createStudent() {
        // arrange
        StudentDTO stu = TestUtilsGenerator.getStudentWith3Subjects("Marco");

        // act
        service.create(stu);

        // assert
        verify(studentDAO, atLeastOnce()).save(stu);
    }

    @Test
    public void readStudent() {
        // arrange
        StudentDTO stu = TestUtilsGenerator.getStudentWith3Subjects("Marco");
        when(studentDAO.findById(stu.getId())).thenReturn(stu);

        // act
        StudentDTO readStu = service.read(stu.getId());

        // assert
        verify(studentDAO, atLeastOnce()).findById(stu.getId());
        assertEquals(stu, readStu);
    }

    @Test
    public void updateStudent() {
        // arrange
        StudentDTO stu = TestUtilsGenerator.getStudentWith3Subjects("Marco");

        // act
        service.update(stu);

        // assert
        verify(studentDAO, atLeastOnce()).save(stu);
    }

    @Test
    public void deleteStudent() {
        // arrange
        StudentDTO stu = TestUtilsGenerator.getStudentWith3Subjects("Marco");

        // act
        service.delete(stu.getId());

        // assert
        verify(studentDAO, atLeastOnce()).delete(stu.getId());
    }

    @Test
    public void getAllStudents() {
        // arrange
        Set<StudentDTO> students = TestUtilsGenerator.getStudentSet();
        when(studentRepo.findAll()).thenReturn(students);

        // act
        Set<StudentDTO> readStudents = service.getAll();

        // assert
        verify(studentRepo, atLeastOnce()).findAll();
        assertTrue(CollectionUtils.isEqualCollection(students, readStudents));
    }
    /*

    @Test
    public void requestRepoWithUrlEspecified(){

        //arrange
        StudentDTO studentDTOMock= TestUtilsGenerator.getStudentWith3SubjectsAverageOver9("Pepe");
        studentDTOMock.setAverageScore(8.0);
        studentDTOMock.setPersonalRepo("https://github.com/AriJDH/santander-exercises/tree/Matias-Romero");
        Boolean result;

        //mock
        when(studentDAO.findById(any())).thenReturn(studentDTOMock);

        //act
        result=service.requestRepo(1L);

        //assert
        assertFalse(result);
    }

    @Test
    public void requestRepoWithAverageScoreGreaterThan9(){

        //arrange
        StudentDTO studentDTOMock= TestUtilsGenerator.getStudentWith3SubjectsAverageOver9("Pepe");
        studentDTOMock.setAverageScore(9.5);
        Boolean result;

        //mock
        when(studentDAO.findById(any())).thenReturn(studentDTOMock);

        //act
        result=service.requestRepo(1L);

        //assert
        assertFalse(result);
    }

    @Test
    public void requestRepo(){

        //arrange
        StudentDTO studentDTOMock= TestUtilsGenerator.getStudentWith3SubjectsAverageOver9("Pepe");
        studentDTOMock.setAverageScore(8.0);
        Boolean result;

        //mock
        when(studentDAO.findById(any())).thenReturn(studentDTOMock);

        //act
        result=service.requestRepo(1L);

        //assert
        assertTrue(result);
    }

     */
}
