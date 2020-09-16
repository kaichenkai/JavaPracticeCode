package reflect;

/**
 * @author: kaichenkai
 * @create: 9/16/2020 20:33
 */
public class APHero extends Hero {
    public void magicAttack(Hero hero) {
        System.out.println(String.format("%s 进行魔法攻击 %s", this.getName(), hero.getName()));
    }
}
