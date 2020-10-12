package jvm;

/**
 * @author: kaichenkai
 * @create: 9/18/2020 20:53
 */
public class Person {
    private String name;
    private Integer age;

    static {
        System.out.println("静态代码块执行了");
    }

    public Person() {

    }
}
