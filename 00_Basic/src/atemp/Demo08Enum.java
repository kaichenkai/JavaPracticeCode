package atemp;

import javax.swing.*;

/**
 * @author: kaichenkai
 * @create: 6/23/2020 17:38
 * 枚举类型
 */
public enum Demo08Enum {
    SPRING, SUMMER, AUTUMN, WINTER
}

class Demo {
    public static void main(String[] args) {
        Demo08Enum season = Demo08Enum.SPRING;
        System.out.println(Demo08Enum.SPRING);
        System.out.println("SPRING".equals(Demo08Enum.SPRING));//false
        switch (season) {
            case SPRING:
                System.out.println("spring");
                break;
            case SUMMER:
                System.out.println("summer");
                break;
            case AUTUMN:
                System.out.println("autumn");
                break;
            case WINTER:
                System.out.println("winter");
                break;
        }

        //遍历枚举类型
        for (Demo08Enum s: Demo08Enum.values()) {
            System.out.println(s);
        }
    }
}