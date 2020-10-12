package annotation;

/**
 * @author: kaichenkai
 * @create: 9/17/2020 14:20
 * 继承父类的 JDBCConfig 注解
 */
public class DBUtilChild extends DBUtils {
    public static void main(String[] args) {
        //通过反射获取该类的注解对象
        JDBCConfig config = DBUtilChild.class.getAnnotation(JDBCConfig.class);
        //
        System.out.println(config);
        System.out.println(config.ip());
        System.out.println(config.database());
        System.out.println(config.encoding());
        System.out.println(config.loginName());
        System.out.println(config.password());
        System.out.println(
        );
    }
}
