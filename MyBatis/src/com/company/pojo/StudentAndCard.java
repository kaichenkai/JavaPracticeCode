package com.company.pojo;

public class StudentAndCard extends Student {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "StudentAndCard{" +
                "number=" + number +
                ", id=" + id +
                ", student_id=" + student_id +
                ", card_id=" + card_id +
                ", name='" + name + '\'' +
                '}';
    }
}
