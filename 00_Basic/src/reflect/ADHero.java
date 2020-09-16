package reflect;

/**
 * @author: kaichenkai
 * @create: 9/16/2020 20:33
 */
public class ADHero extends Hero {
    public void physicAttack(Hero hero) {
        System.out.println(String.format("%s 进行物理攻击 %s", this.getName(), hero.getName()));
    }
}
