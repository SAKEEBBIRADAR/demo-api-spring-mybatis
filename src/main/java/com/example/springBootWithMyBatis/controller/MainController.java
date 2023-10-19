package com.example.springBootWithMyBatis.controller;

import com.example.springBootWithMyBatis.mapper.StudentMapper;
import com.example.springBootWithMyBatis.model.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
//@RequestMapping(value = "/api", consumes = "application/json", produces = "application/json")
@RequestMapping("api/v3")
public class MainController{
    @Autowired
    StudentMapper studentMapper;
    @GetMapping
    public List<Students> findAllStudents(){
        return studentMapper.findAllStudents();
    }

    @GetMapping(path = "{id}")
    public Students findStudentById(@PathVariable("id") Integer id) {
        return studentMapper.findStudentById(id);
    }
    @PostMapping
    public void insertStudent(@RequestBody Students students){
        studentMapper.insertStudent(students);
    }
    @PutMapping(path = "{id}")
    public void updateStudent(@RequestBody Students students,@PathVariable("id") int id){
        studentMapper.updateStudent(students,id);
    }
    @DeleteMapping(path = "{id}")
    public void deleteStudent(@PathVariable("id") int id){
        studentMapper.deleteStudent(id);
    }
}