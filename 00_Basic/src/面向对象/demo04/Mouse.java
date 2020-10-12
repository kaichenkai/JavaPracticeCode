package 面向对象.demo04;

/**
 * @author: kaichenkai
 * @create: 9/18/2020 19:54
 */
public class Mouse implements USB {
    String name = "mouse";

    @Override
    public void enable() {
        System.out.println("enable " + this.name);
    }

    @Override
    public void disable() {
        System.out.println("disable " + this.name);
    }

    //额外的点击方法
    public void click() {
        System.out.println("click on the event");
    }
}
