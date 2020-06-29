package atemp.DemoInterface;

/**
 * @author: kaichenkai
 * @create: 6/23/2020 18:21
 */
public class ADAPHero extends Hero implements AD, AP{
    public String skillThree = "adaphero jineng 3";

    public void jineng3(){
        System.out.println(this.skillThree);
    }

    @Override
    public void physicAttack(String skill) {
        System.out.println("进行 physic attack");
        System.out.println(skill);
    }

    @Override
    public void magicAttack(String skill) {
        System.out.println("进行 magic attack");
        System.out.println(skill);
    }
}
