package reflect;

/**
 * @author: kaichenkai
 * @create: 9/15/2020 15:26
 * 获取类对象
 */
public class Demo01GetClassObject {
    public static void main(String[] args) {
        String className = "反射.Hero";
        try {
            Class pClass1 = Class.forName(className);
            Class pClass2 = Hero.class;
            Class pClass3 = new Hero().getClass();
            System.out.println(pClass1 == pClass2);//true
            System.out.println(pClass2 == pClass3);//true
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
