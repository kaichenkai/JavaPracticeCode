package com.company.mapper;

import com.company.pojo.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface StudentMapper {
    // 根据 id 查询学生信息
    @Select("select * from student where id=#{id}")
    public Student findSudentById(int id) throws Exception;

    // 添加学生信息
    @Insert("insert into student (id, studentId, name) values(#{id}, #{studentId}, #{name})")
    public void insertStudent(Student student) throws Exception;

    // 删除学生信息
    @Delete("delete from student where id = #{id}")
    public void deleteStudent(int id) throws Exception;

    // 修改学生信息
    @Update("update student set name=#{name} where id=#{id}")
    public void updateStudent(Student student) throws Exception;
}
