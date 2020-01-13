package com.company.pojo;

public class StudentWithCard {
    int id;
    int number;
    Student student;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "StudentWithCard{" +
                "id=" + id +
                ", number=" + number +
                ", student=" + student +
                '}';
    }
}
