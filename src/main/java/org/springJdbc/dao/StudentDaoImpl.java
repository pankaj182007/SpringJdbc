package org.springJdbc.dao;

import org.springJdbc.entity.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class StudentDaoImpl implements StudentDao{


    JdbcTemplate jdbcTemplate;
    @Override
    public int insert(Student student) {
        // insert Operation
        String insertQuary="insert into student(id,name,city) values(?,?,?)";
        int result = jdbcTemplate.update(insertQuary,student.getId(),student.getName(),student.getCity());

        return result;
    }

    @Override
    public int change(Student student) {
        //update operation
        String updateQuary="update student set name=?, city=? where id=?";
        int result=jdbcTemplate.update(updateQuary,student.getName(),student.getCity(),student.getId());
        return result;
    }

    @Override
    public int remove(int id) {
        //Delete operation
        String deleteQuary="delete from student where id=?";
        int result =jdbcTemplate.update(deleteQuary,id);
        return result;
    }

    @Override
    public Student fetchStudent(int id) {
        //select operation for single object
        String selectQuary="select * from student where id=?";
        RowMapper<Student> rowMapper=new RowMaperImpl();
        return jdbcTemplate.queryForObject(selectQuary,rowMapper,id);
    }

    @Override
    public List<Student> featchAllStudent() {
        String selectAllQuary="select * from student";

        List<Student> students=jdbcTemplate.query(selectAllQuary,new RowMaperImpl());
        return students;
    }


    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
