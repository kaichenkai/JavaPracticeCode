package 面向对象.demo03;

/**
 * @author: kaichenkai
 * @create: 9/17/2020 20:05
 * User基类
 */
public class User {
    private String name;
    private int money;

    public User () {

    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void show() {
        String str = String.format("my name is %s, i have %d yuan", this.name, this.money);
        System.out.println(str);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
