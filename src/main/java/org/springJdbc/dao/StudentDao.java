package org.springJdbc.dao;

import org.springJdbc.entity.Student;

import java.util.List;

public interface StudentDao {

    public int insert(Student student);

    public int change(Student student);

    public int remove(int id);

    public Student fetchStudent(int id);

    public List<Student> featchAllStudent();
}
