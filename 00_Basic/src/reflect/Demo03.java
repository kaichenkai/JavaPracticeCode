package reflect;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * @author: kaichenkai
 * @create: 9/16/2020 20:07
 * 从 hero.config 配置文件中读取全类名, 获取构造器, 创建出对象
 * 提示: 包名是中文加载类会有问题
 */
public class Demo03 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\94079\\Desktop\\github.com\\JavaPracticeCode\\00_Basic\\src\\反射\\hero.config");
        try(Reader fr = new FileReader(file)) {
            char[] chars = new char[(int) file.length()];
            fr.read(chars);
            //使用反射的方式创建对象
            String className = new String(chars);
            System.out.println(className);
            //类对象
            Class pClass = Class.forName(className);
            //构造器
            Constructor constructor = pClass.getConstructor();
            Hero h2 = (Hero) constructor.newInstance();
            h2.setName("gareen");
            System.out.println(h2);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
