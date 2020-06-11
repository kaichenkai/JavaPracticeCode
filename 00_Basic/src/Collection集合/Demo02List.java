package Collection集合;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author: kaichenkai
 * @create: 5/27/2020 18:15
 * List 的 contains() 和 indexOf() 方法测试
 * contains() 和 indexOf()方法中使用的是 equals() 方法, 因此,放入的元素必须正确覆写了 equals() 方法, java标准库 String, Integer等已覆写了 equals()
 * 如果不在 List 中查找元素, 就不必覆写 equals()
 */
public class Demo02List {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("A");
//        list.add("B");
//        list.add("C");
//        System.out.println(list.contains("C"));
//        System.out.println(list.contains("Z"));
//        System.out.println(list.indexOf("C"));
//        System.out.println(list.indexOf("Z"));
//        System.out.println("=====================");
//        System.out.println(list.contains(new String("C"))); //true
//        System.out.println(list.indexOf(new String("C"))); //2

        // 自定义对象实现 equals() 方法
        List<Person> list = new ArrayList<>();
        Person p1 = new Person(null, 20);
        Person p2 = new Person("xiaohong", 20);
        Person p3 = new Person("xiaohong", 20);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        Person p4 = new Person("xiaohong", 20);
        System.out.println(list.contains(p4)); //true
        System.out.println(list.indexOf(p4)); //1
    }
}

//以 Person 对象为例, 测试一下
class Person {
    private String name;  //String字符串的默认值：null
    private int age; //int的默认值：0

    // 覆写 equals() 方法
//    @Override
//    public boolean equals(Object obj) {
//        if (obj instanceof Person) {
//            Person p = (Person) obj;
//            // 判断 name 的值是否相等
//            boolean nameEquals = false;
//            if (this.name == null && p.name == null) {
//                nameEquals = true;
//            }
//            if (this.name != null) {
//                nameEquals = this.name.equals(p.name);
//            }
//            if (p.name != null) {
//                nameEquals = p.name.equals(this.name);
//            }
//
//            // 判断 age 的值是否相等
//            boolean ageEquals = false;
//            if (this.age == p.age) {
//                ageEquals = true;
//            }
//
//            if (nameEquals && ageEquals) {
//                return true;
//            }
//        }
//        return false;
//    }

    //覆写 equals() 方法: 简写: 使用 Objects.equals() 静态方法
    //使用Objects.equals()比较两个引用类型是否相等的目的是省去了判断null的麻烦。两个引用类型都是null时它们也是相等的
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person p = (Person) obj;
            return Objects.equals(this.name, p.name) && this.age == p.age;
        }
        return false;
    }


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}