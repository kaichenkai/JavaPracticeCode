package com.company.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public void printStudentInfo() {
        System.out.println("学生的姓名是: " + student.getName());
    }
}
