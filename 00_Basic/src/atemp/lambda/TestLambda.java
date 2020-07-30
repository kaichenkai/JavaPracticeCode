package atemp.lambda;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: kaichenkai
 * @create: 7/27/2020 16:47
 */
public class TestLambda {
    public static void main(String[] args) {
        List<Hero> heroList = new ArrayList<>();
        Hero hero1 = new Hero("hero1", 12, 600, 100);
        Hero hero2 = new Hero("hero2", 12, 700, 200);
        Hero hero3 = new Hero("hero3", 12, 800, 300);
        Hero hero4 = new Hero("hero4", 12, 900, 400);
        Hero hero5 = new Hero("hero5", 12, 1000, 500);
        //
        heroList.add(hero1);
        heroList.add(hero2);
        heroList.add(hero3);
        heroList.add(hero4);
        heroList.add(hero5);
        //
        Checker checker = new Checker() {
            @Override
            public boolean check(Hero hero) {
                return hero.getHp() > 800 && hero.getDamage() > 300;
            }
        };

        //匿名内部类方式
        filter(heroList, checker);

        //lambda 方式
        filter(heroList, hero -> hero.getHp() > 800 && hero.getDamage() > 300);
    }

    public static void filter(List<Hero> heroList, Checker checker) {
        for (Hero hero : heroList) {
            if (checker.check(hero)) {
                System.out.println(hero);
            }
        }
    }
}

class Hero {
    private String name;
    private int age;
    private int hp;
    private int damage;

    public Hero() {
    }

    public Hero(String name, int age, int hp, int damage) {
        this.name = name;
        this.age = age;
        this.hp = hp;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hp=" + hp +
                ", damage=" + damage +
                '}';
    }
}