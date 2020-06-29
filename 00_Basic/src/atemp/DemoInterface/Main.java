package atemp.DemoInterface;

/**
 * @author: kaichenkai
 * @create: 6/23/2020 18:25
 */
public class Main {
    public static void main(String[] args) {
        Hero adapHero = new ADAPHero();
        adapHero.setName("伊泽");
        adapHero.setSkillOne("jineng 1");
        adapHero.setSkillTwo("jineng 2");
        System.out.println(adapHero.getSkillOne());
        System.out.println(adapHero.skillThree);

        adapHero.jineng3();
    }
}
