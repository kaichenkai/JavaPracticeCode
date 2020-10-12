package annotation;

import java.lang.annotation.Annotation;

/**
 * @author: kaichenkai
 * @create: 9/17/2020 14:09
 * 解析自定义注解
 */
@JDBCConfig(ip="127.0.0.1", database = "test", encoding = "UTF8", loginName = "root", password = "123456")
public class DBUtils {
    public static void main(String[] args) {
        //通过反射获取该类的注解对象
        JDBCConfig config = DBUtils.class.getAnnotation(JDBCConfig.class);
        //
        System.out.println(config.ip());
        System.out.println(config.database());
        System.out.println(config.encoding());
        System.out.println(config.loginName());
        System.out.println(config.password());
    }
}
