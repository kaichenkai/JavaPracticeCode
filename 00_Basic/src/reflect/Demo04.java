package reflect;

import java.lang.reflect.Field;

/**
 * @author: kaichenkai
 * @create: 9/16/2020 20:24
 * 通过反射修改属性的值
 *
 * getField和getDeclaredField的区别
 * 这两个方法都是用于获取字段
 * getField 只能获取public的，包括从父类继承来的字段。
 * getDeclaredField 可以获取本类所有的字段，包括private的，但是不能获取继承来的字段。 (注： 这里只能获取到private的字段，但并不能访问该private字段的值,除非加上setAccessible(true))
 */
public class Demo04 {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("garen");
        //通过反射
        try {
            Field field = hero.getClass().getDeclaredField("name");
            field.set(hero, "teemmo");
            System.out.println(hero.getName());
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
