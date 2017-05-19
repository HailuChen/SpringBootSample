package com.springboot.mapper;

import com.springboot.entity.Student;
import org.apache.ibatis.annotations.Delete;

import java.util.List;

public interface StudentMapper {

    List<Student> getAll();

    Student getByName(String name);

    Student getById(Integer id);

    void insert(Student student);


    //使用MyBatis注解形式操作数据库
    @Delete("DELETE FROM student WHERE id = #{id}")
    void delete(Integer id);


}
