package atemp.oopDemo;

/**
 * @author: kaichenkai
 * @create: 6/24/2020 17:15
 */
public class Cat extends Animal implements Pet{//先继承, 再实现
//public class Cat implements Pet extends Animal{
    private String name;

    //全参构造
    public Cat(String name){
        super(4);//猫有4只脚, 必须要调用 父级构造方法
        this.name = name;
    }

    public Cat(){
        this("");//调用自己, 传入空的 name
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void play() {

    }

    @Override
    public void eat() {
        System.out.println("cat eating");
    }
}
