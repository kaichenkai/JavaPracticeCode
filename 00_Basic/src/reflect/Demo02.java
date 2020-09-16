package reflect;

import java.lang.reflect.Constructor;

/**
 * @author: kaichenkai
 * @create: 9/16/2020 20:07
 * 通过反射机制创建一个对象
 */
public class Demo02 {
    public static void main(String[] args) {
        Hero h1 = new Hero();
        h1.setName("teemo");
        System.out.println(h1);

        try {
            //使用反射的方式创建对象
            String className = "反射.Hero";
            //类对象
            Class pClass = Class.forName(className);
            //构造器
            Constructor constructor = pClass.getConstructor();
            Hero h2 = (Hero) constructor.newInstance();
            h2.setName("gareen");
            System.out.println(h2);
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
