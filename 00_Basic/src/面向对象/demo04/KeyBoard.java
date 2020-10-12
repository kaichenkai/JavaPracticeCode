package 面向对象.demo04;

/**
 * @author: kaichenkai
 * @create: 9/18/2020 20:05
 */
public class KeyBoard implements USB {
    private String name = "key board";

    @Override
    public void enable() {
        System.out.println("enable " + this.name);
    }

    @Override
    public void disable() {
        System.out.println("disable " + this.name);
    }

    public void tap() {
        System.out.println("tap on a event");
    }
}
