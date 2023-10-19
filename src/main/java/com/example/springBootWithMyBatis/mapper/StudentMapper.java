package com.example.springBootWithMyBatis.mapper;

import com.example.springBootWithMyBatis.model.Students;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentMapper{
    List<Students> findAllStudents();
    Students findStudentById(Integer id);
    void insertStudent(Students student);
    void updateStudent(Students student, int id);
    void deleteStudent(Integer id);
}