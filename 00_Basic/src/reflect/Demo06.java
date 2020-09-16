package reflect;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author: kaichenkai
 * @create: 9/16/2020 20:35
 */
public class Demo06 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\94079\\Desktop\\github.com\\JavaPracticeCode\\00_Basic\\src\\reflect\\hero.config");
        try(Reader fr = new FileReader(file)) {
            char[] chars = new char[(int) file.length()];
            fr.read(chars);
            //使用反射的方式创建对象
            String content = new String(chars);
            String[] elements = content.split("\r\n");
            String className1 = elements[0];
            String heroName1 = elements[1];
            String className2 = elements[2];
            String heroName2 = elements[3];

            //通过反射创建英雄
            Class apHeroClass = Class.forName(className1);
            Class adHeroClass = Class.forName(className2);
            //构造器创建英雄
            Constructor apConstructor = apHeroClass.getConstructor();
            Constructor adConstructor = adHeroClass.getConstructor();
            Hero apHero = (APHero) apConstructor.newInstance();
            Hero adHero = (ADHero) adConstructor.newInstance();

            //通过反射修改英雄名称
            Field apHeroNameField = apHeroClass.getField("name");
            Field adHeroNameField = adHeroClass.getField("name");
            apHeroNameField.set(apHero, "teemo");
            adHeroNameField.set(adHero, "garen");

            //通过反射调用ap英雄来攻击ad英雄
            Method magicAttackMethod = apHeroClass.getMethod("magicAttack", Hero.class);
            magicAttackMethod.invoke(apHero, adHero);  //teemo 进行魔法攻击 garen

            //物理攻击英雄自己打自己
            Method physicAttackMethod = adHeroClass.getMethod("physicAttack", Hero.class);
            physicAttackMethod.invoke(adHero, adHero); //garen 进行物理攻击 garen

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
