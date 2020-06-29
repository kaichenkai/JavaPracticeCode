package atemp;

/**
 * @author: kaichenkai
 * @create: 6/23/2020 15:32
 */
public class Demo05HeroClass {
    private static String copyright;
    private String name = "some hero";
    private int hp;
    //静态属性
    private static String classRoom;


    //初始化 代码块
    {
        name = "static custom name";
        classRoom = "room name";
    }

    Demo05HeroClass(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    Demo05HeroClass(){}

    public static void main(String[] args) {
        Demo05HeroClass garen = new Demo05HeroClass("garen", 600);
        System.out.println(garen.name);
        Demo05HeroClass teemo = new Demo05HeroClass("teemo", 500);
        System.out.println(teemo.name);
        Demo05HeroClass.copyright = "copyright";
        System.out.println(teemo.copyright);
        garen.copyright =  "Blizzard Entertainment Enterprise";
        System.out.println(teemo.copyright);

        //test name
        Demo05HeroClass demo = new Demo05HeroClass();
        System.out.println(demo.name);

        //输出类属性的值
        System.out.println(Demo05HeroClass.classRoom);
    }
}
