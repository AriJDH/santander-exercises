package c12exercises.diploma.services;

import c12exercises.diploma.dao.Dao;
import c12exercises.diploma.models.Student;
import c12exercises.diploma.dao.DaoStudent;
import c12exercises.diploma.models.Subject;

import java.nio.file.InvalidPathException;
import java.util.List;

public class StudentService {

    Dao<String, Student> studentDao = new DaoStudent();

    public List<Student> getStudents() {
        return studentDao.getElements();
    }

    public Student getStudent(String name) {
        Student s = studentDao.getElement(name);

        if (s == null) {
            throw new InvalidPathException(name, "the student doesn't exist");
        } else {
            return s;
        }
    }

    public void addStudent(Student s) {

        studentDao.addElement(s);
    }

    public double getAverage(String name) {
        Student s = studentDao.getElement(name);

        if (s == null) {
            throw new InvalidPathException(name, "the student doesn't exist");
        }

        double average = 0;
        double sum = 0;

        for(Subject st: s.getSubjects()) {
            sum += st.getGrade();
        }

        average = sum/s.getSubjects().size();

        return average;
    }

}