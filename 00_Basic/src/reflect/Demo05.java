package reflect;

import java.lang.reflect.Method;

/**
 * @author: kaichenkai
 * @create: 9/16/2020 20:28
 * 通过反射调用方法
 */
public class Demo05 {
    public static void main(String[] args) {
        Hero hero = new Hero();
        //
        try {
            //获取这个名字叫做 setName 参数类型是 String 的方法
            Method method = hero.getClass().getMethod("setName", String.class);
            method.invoke(hero, "garen");
            System.out.println(hero.getName());
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
