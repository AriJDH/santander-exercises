package com.practica.obtenerdiploma.test_sin_mock;

import com.practica.obtenerdiploma.TestUtilsGenerator;
import com.practica.obtenerdiploma.exception.StudentNotFoundException;
import com.practica.obtenerdiploma.model.StudentDTO;
import com.practica.obtenerdiploma.repository.IStudentDAO;
import com.practica.obtenerdiploma.repository.IStudentRepository;
import com.practica.obtenerdiploma.repository.StudentDAO;
import com.practica.obtenerdiploma.repository.StudentRepository;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio1Test {
    StudentDAO studentDAO;
    StudentRepository studentRepository;

    @BeforeEach
    void setUp(){
        TestUtilsGenerator.emptyUsersFile();
        this.studentDAO=new StudentDAO();
        this.studentRepository=new StudentRepository();
    }
    @Test
    void addStudentTest(){
        StudentDTO student= TestUtilsGenerator.getStudentWith3Subjects("Pepito");
        studentDAO.save(student);
        assertEquals(true,studentDAO.exists(student));

    }
    @Test
    void addNullStudentTest() {
        StudentDTO student= null;
        assertThrows(NullPointerException.class,()->studentDAO.save(student));
    }

    @Test
    void findNotRegisteredStudentTest(){
        StudentDTO student= TestUtilsGenerator.getStudentWith3Subjects("Pepito");
        studentDAO.save(student);
        StudentDTO student2= TestUtilsGenerator.getStudentWith3Subjects("Martin");
        assertThrows(StudentNotFoundException.class,()->studentDAO.findById(student2.getId()));

    }
    @Test
    void modifyStudentTest(){
        StudentDTO student= TestUtilsGenerator.getStudentWith3Subjects("Pepito");
        studentDAO.save(student);
        studentDAO.findById(student.getId()).setStudentName("Martin");

        assertEquals("Martin",studentDAO.findById(student.getId()).getStudentName());
    }
    /*

    @Test
    void modifyStudentInvalidTest(){
        StudentDTO studentEnviado= TestUtilsGenerator.getStudentWith3Subjects("Pepito");
        StudentDTO studentEsperado= TestUtilsGenerator.getStudentWith3Subjects("Pepito");
        studentDAO.save(studentEnviado);
        studentDAO.findById(studentEnviado.getId()).setStudentName(null);
        assertEquals(studentEsperado.getStudentName(),studentDAO.findById(studentEnviado.getId()).getStudentName());
    }

     */

    @Test
    void deleteStudentTest(){
        StudentDTO student= TestUtilsGenerator.getStudentWith3Subjects("Pepito");
        studentDAO.save(student);
        studentDAO.delete(student.getId());
        assertThrows(StudentNotFoundException.class,()->studentDAO.exists(student));
    }
    @Test
    void listAllStudentTest(){
        StudentDTO student= TestUtilsGenerator.getStudentWith3Subjects("Pepito");
        studentDAO.save(student);
        assertNotNull(studentRepository.findAll());
    }

}
