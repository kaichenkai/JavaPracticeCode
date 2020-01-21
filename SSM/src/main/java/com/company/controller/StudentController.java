package com.company.controller;

import com.company.entity.Student;
import com.company.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import utils.Page;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Student 类控制器
 */
@Controller
@RequestMapping("")
public class StudentController {
    @Autowired
    private StudentService studentService;

    // 获取 student 总数
    @RequestMapping("getTotal")
    public int getTotal(){
        return studentService.getTotal();
    }

    // 增加一条 student 记录
    @RequestMapping("addStudent")
    public String addStudent(HttpServletRequest request, HttpServletResponse response){
        Student student = new Student();

        String studentId = request.getParameter("studentId");
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        String birthday = request.getParameter("birthday");
        String address = request.getParameter("address");
        String qq = request.getParameter("qq");
        String email = request.getParameter("email");

        // 日期转换
        SimpleDateFormat  sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dateBirthday = null;
        try {
            dateBirthday = sdf.parse(birthday);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //
        student.setStudentId(studentId);
        student.setName(name);
        student.setGender(gender);
        student.setBirthday(dateBirthday);
        student.setAddress(address);
        student.setQq(qq);
        student.setEmail(email);
        //
        studentService.addStudent(student);
        return "redirect:studentList";
    }

    @RequestMapping("/studentList")
    public String studentList(HttpServletRequest request, HttpServletResponse response){
        // 获取分页参数
        int start = 0;
        int count = 10;
        String argsStart = request.getParameter("page.start");
        String argsCount = request.getParameter("page.count");
        if (argsStart != null) {
            start = Integer.parseInt(argsStart);
        }
        if (argsCount != null) {
            count = Integer.parseInt(argsCount);
        }

        Page page = new Page(start, count);
        List<Student> students = studentService.studentList(start, count);
        int total = studentService.getTotal();
        //
        page.setTotal(total);
        request.setAttribute("students", students);
        request.setAttribute("page", page);
        return "studentList";
    }

    @RequestMapping("delStudent")
    public String delStudent(int id){
        studentService.delStudent(id);
        return "redirect:studentList";
    }

    @RequestMapping("editStudent")
    public ModelAndView editStudent(int id){
        ModelAndView mav = new ModelAndView("editStudent");
        Student student = studentService.getStudentById(id);
        mav.addObject(student);
        return mav;
    }

    @RequestMapping("updateStudent")
    public String updateStudent(HttpServletRequest request, HttpServletResponse response){
        Student student = new Student();
        int id = Integer.parseInt(request.getParameter("id"));
        String studentId = request.getParameter("studentId");
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        String birthday = request.getParameter("birthday");
        String address  = request.getParameter("address");
        String qq = request.getParameter("qq");
        String email = request.getParameter("email");

        // 日期转换
        Date dateBirthday = null;
        if (!"".equals(birthday)){
            SimpleDateFormat  sdf = new SimpleDateFormat("yyyy-MM-dd");
            try {
                dateBirthday = sdf.parse(birthday);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        //
        student.setId(id);
        student.setStudentId(studentId);
        student.setName(name);
        student.setGender(gender);
        student.setBirthday(dateBirthday);
        student.setAddress(address);
        student.setQq(qq);
        student.setEmail(email);
        //
        studentService.updateStudent(student);
        return "redirect:studentList";
    }
}
