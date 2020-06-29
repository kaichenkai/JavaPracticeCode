package atemp;

/**
 * @author: kaichenkai
 * @create: 6/23/2020 16:44
 * 懒汉式单例模式
 *
 * 饿汉式是立即加载的方式，无论是否会用到这个对象，都会加载。
 * 如果在构造方法里写了性能消耗较大，占时较久的代码，比如建立与数据库的连接，那么就会在启动的时候感觉稍微有些卡顿。
 *
 * 懒汉式，是延迟加载的方式，只有使用的时候才会加载。 并且有线程安全的考量(鉴于同学们学习的进度，暂时不对线程的章节做展开)。
 * 使用懒汉式，在启动的时候，会感觉到比饿汉式略快，因为并没有做对象的实例化。 但是在第一次调用的时候，会进行实例化操作，感觉上就略慢。
 *
 * 看业务需求，如果业务上允许有比较充分的启动和初始化时间，就使用饿汉式，否则就使用懒汉式
 */
public class Demo07Singleton2 {
    //私有化的构造方法使得该类无法在外部通过 new 进行实例化
    private Demo07Singleton2(){}

    //准备一个类属性, 指向一个实例化对象的, 因为是类属性, 所有只有一个
    private static Demo07Singleton2 instance;

    //public static 方法, 提供给调用者获取12行定义的对象
    public static Demo07Singleton2 getInstance() {
        //第一次访问的时候，发现instance没有指向任何对象，这时实例化一个对象
        if (instance == null) {
            instance = new Demo07Singleton2();
        }
        //返回 instance 指向的对象
        return instance;
    }

//    public static void main(String[] args) {
//        DemoSingleton2 demoSingleton = DemoSingleton2.getInstance();
//        System.out.println(demoSingleton.hashCode());
//        DemoSingleton2 demoSingleton1 = DemoSingleton2.getInstance();
//        System.out.println(demoSingleton1.hashCode());
//    }
}
