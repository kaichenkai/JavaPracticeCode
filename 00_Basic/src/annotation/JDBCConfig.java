package annotation;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.*;

/**
 * @author: kaichenkai
 * @create: 9/17/2020 14:02
 */

@Target({TYPE, METHOD})//能修饰类, 接口, 枚举 或者 方法
@Retention(RetentionPolicy.RUNTIME)//运行时
@Inherited//可被继承
@Documented//文档说明
public @interface JDBCConfig {
    String ip();
    int port() default 3306;
    String database();
    String encoding();
    String loginName();
    String password();
}
