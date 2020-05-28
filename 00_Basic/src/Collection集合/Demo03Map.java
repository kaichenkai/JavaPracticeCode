package Collection集合;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: kaichenkai
 * @create: 5/28/2020 17:20
 * Map
 */
public class Demo03Map {
public static void main(String[] args) {
    //定义Map
    Map<String, Student> studentMap = new HashMap<>();
    //定义学生
    Student s1 = new Student("xiaohong", 19);
    Student s2 = new Student("xiaogang", 20);
    //添加到 Map中
    studentMap.put("xiaohong", s1);
    studentMap.put("xiaogang", s2);
    //从 Map中通过key获取值
    System.out.println(studentMap.get("xiaogang").toString());
    System.out.println(studentMap.get("test"));//未找到返回null

    // foreach 遍历 Map
    for (String key : studentMap.keySet()) {
        System.out.println(studentMap.get(key).getName());
    }
}
}

class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}