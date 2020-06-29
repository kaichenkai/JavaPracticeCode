package atemp;

/**
 * @author: kaichenkai
 * @create: 6/23/2020 16:44
 * 饿汉式单例模式
 */
public class Demo06Singleton {
    //私有化的构造方法使得该类无法在外部通过 new 进行实例化
    private Demo06Singleton(){}

    //准备一个类属性, 指向一个实例化对象的, 因为是类属性, 所有只有一个
    private final static Demo06Singleton instance;

    static {
        instance = new Demo06Singleton();
    }

    //public static 方法, 提供给调用者获取12行定义的对象
    public static Demo06Singleton getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        Demo06Singleton demo06Singleton = Demo06Singleton.getInstance();
        System.out.println(demo06Singleton.hashCode());
        Demo06Singleton demo06Singleton1 = Demo06Singleton.getInstance();
        System.out.println(demo06Singleton1.hashCode());
    }
}
