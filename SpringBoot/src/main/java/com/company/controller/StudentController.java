package com.company.controller;

import com.company.pojo.Student;
import com.company.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Student 控制器
 *
 * @author: kaichenkai
 * @create: 5/26/2020 17:23
 */
@RestController
public class StudentController {
    @Autowired
    private StudentMapper studentMapper;

    @RequestMapping("/students")
    public String students() {
        List<Student> studentList = studentMapper.findAll();
        StringBuilder result = new StringBuilder();
        for (Student student : studentList) {
            result.append(student.toString());
            result.append("\r\n");
        }
        return result.toString();
    }
}
