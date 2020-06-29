package atemp.DemoInterface;

/**
 * @author: kaichenkai
 * @create: 6/23/2020 18:21
 */
public class ADHero extends Hero implements AD{
    @Override
    public void physicAttack(String skill) {
        System.out.println("进行 physic attack");
    }
}
