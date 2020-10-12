package 面向对象.demo01;

/**
 * @author: kaichenkai
 * @create: 9/22/2020 16:59
 */
public class Person{

    static int x=10;
    static {x+=5;}

    protected void finalize(){
        System.out.println("finalize method execute..");
    }

    public static void main(String[] args) {
        int a, b;
        Person person = new Person();
        for (a= 1, b = 4; a<b; a++, b--) {
            System.out.println(a);
            System.out.println(b);
        }
    }
}
