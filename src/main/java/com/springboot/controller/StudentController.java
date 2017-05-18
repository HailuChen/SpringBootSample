package com.springboot.controller;

import com.springboot.entity.Student;
import com.springboot.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentMapper studentMapper;

    @RequestMapping("/get_by_name")
    public Student getByName() {
        return studentMapper.getByName("chen");
    }

    @RequestMapping("/get_by_id")
    public Student getById() {
        return studentMapper.getById(2);
    }

    @RequestMapping("/get")
    public List<Student> getAll() {
        return studentMapper.getAll();
    }

    @RequestMapping("/add")
    public String insert() {
        Student student = new Student();
        student.setName("xiaolin");
        student.setScore(70.0);
        studentMapper.insert(student);
        return "OK";
    }
}
