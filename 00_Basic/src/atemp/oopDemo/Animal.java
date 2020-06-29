package atemp.oopDemo;

/**
 * @author: kaichenkai
 * @create: 6/24/2020 16:59
 */
public abstract class Animal {
    private int legs;//记录动物的腿的数目

    //全参构造
    public Animal(int legs) {
        this.legs = legs;
    }

    //实例方法
    public void walk() {
        System.out.println("animal walking");
        System.out.println(this.legs);
    }

    //抽象方法
    public abstract void eat();

    //getter and setter
    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}
