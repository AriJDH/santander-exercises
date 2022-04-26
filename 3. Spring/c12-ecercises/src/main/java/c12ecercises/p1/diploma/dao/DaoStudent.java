package c12ecercises.p1.diploma.dao;

import c12ecercises.p1.diploma.models.Student;

import java.util.ArrayList;
import java.util.List;

public class DaoStudent implements Dao<String, Student>{

    private List<Student> students;

    public DaoStudent() {
        this.students = new ArrayList<>();
    }

    @Override
    public List getElements() {
        return this.students;
    }

    @Override
    public Student getElement(String name) {

        Student s=null;

        for(Student st: this.students) {
            if (st.getName().equals(name)) {
                s = st;
            }
        }

        return s;
    }

    @Override
    public void addElement(Student student) {
        this.students.add(student);
    }

}
