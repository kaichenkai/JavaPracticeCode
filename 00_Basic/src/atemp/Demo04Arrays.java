package atemp;

import java.util.*;

/**
 * @author: kaichenkai
 * @create: 6/23/2020 14:27
 */
public class Demo04Arrays {
    public static void main(String[] args) {
        int[] arrayNum = {5, 1, 6, 3, 9, 3};
        int[] arrayNum2 = {5, 1, 6, 3, 9, 3};
        int[] arrayNum3 = {5, 1, 6, 3, 9, 3};
        String[] arrayString = {"bbb", "ccc", "aaa"};

        // toString()
        System.out.println(Arrays.toString(arrayNum));  // [5, 1, 6, 3, 9]

        // sort()
        Arrays.sort(arrayNum);
        System.out.println(Arrays.toString(arrayNum));  // [1, 3, 5, 6, 9]
        Arrays.sort(arrayString);
        System.out.println(Arrays.toString(arrayString));  // [aaa, bbb, ccc]

        //查询元素出现的位置（如果数组中有多个相同的元素，查找结果是不确定的）
        System.out.println(Arrays.binarySearch(arrayNum, 3));//返回元素所在的索引值
        System.out.println(Arrays.binarySearch(arrayNum, 999));//没有找到返回负的整数

        // 判断两个数组是否相同
        System.out.println(Arrays.equals(arrayNum, arrayNum2));//false
        System.out.println(Arrays.equals(arrayNum2, arrayNum3));//true

        Hero[] heroes = new Hero[]{new Hero("one"), new Hero("two"), new Hero("three")};
        List<Hero> list = new ArrayList<>();
//        System.out.println(list);
        //Arrays.asList() 返回的是Arrays内部静态类，而不是Java.util.ArrayList的类。
        //这个java.util.Arrays.ArrayList有set(),get(),contains()方法，但是没有任何add() 方法，所以它是固定大小的
        //list.add(new Hero("four"));//Unsupported Operation Exception
        Collections.addAll(list, heroes);
        list.add(new Hero("four"));
        System.out.println(list);

    }
}


class Hero{
    private String name;
    private int hp;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                '}';
    }
}