package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author: kaichenkai
 * @create: 6/29/2020 17:14
 */
public class Demo01 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Hero> heroList = new ArrayList<>();
        for (int i=0; i<5; i++) {
            heroList.add(new Hero("hero" + i, random.nextInt(1000), random.nextInt(100)));
        }
        System.out.println("初始化后的集合:");
        System.out.println(heroList);
        System.out.println("使用 lambda 过滤之后的集合:");
        //条件过滤
//        filter(heroList, (hero) -> hero.getHp()>100 && hero.getDamage()<50);
        HeroChecker checker = (hero) -> hero.getHp()>100 && hero.getDamage()<50;
        filter(heroList, checker);
    }

    public static void filter(List<Hero> heroList, HeroChecker checker){
        for (Hero hero : heroList) {
            if (checker.test(hero)) {
                System.out.println(hero);
            }
        }
    }
}
