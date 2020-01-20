package com.company.service;

import com.company.entity.Student;

import java.util.List;

public interface StudentService {
    /**
     * 获取 student 总数
     */
    int getTotal();

    /**
     * 增加一条数据
     */
    void addStudent(Student student);

    /**
     * 删除一条数据
     */
    void delStudent(int id);

    /**
     * 修改一条数据
     */
    void updateStudent(Student student);

    /**
     * 根据 id 查询 student
     */
    Student getStudentById(int id);

    /**
     * 列举从 start 开始的 count 条数据
     */
    List<Student> studentList(int start, int count);
}
