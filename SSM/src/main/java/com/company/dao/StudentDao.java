package com.company.dao;

import com.company.entity.Student;

import java.util.List;

public interface StudentDao {
    // 获取学生总数
    int getTotal();
    // 增加学生
    void addStudent(Student student);
    // 删除学生
    void delStudent(int id);
    // 修改学生信息
    void updateStudent(Student student);
    // 根据 id 查询学生信息
    Student getStudentById(int id);
    // 获取学生信息列表
    List<Student> studentList(int start, int count);
}
