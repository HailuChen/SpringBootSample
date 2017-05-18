package com.springboot.mapper;

import com.springboot.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {

    List<Student> getAll();

    Student getByName(String name);

    Student getById(Integer id);

    void insert(Student student);

}
