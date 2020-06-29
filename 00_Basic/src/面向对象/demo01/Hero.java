package 面向对象.demo01;

/**
 * @author: kaichenkai
 * @create: 6/23/2020 10:38
 */
public class Hero {
    private String name;
    private float hp;
    private float armor;//护甲值
    private int moveSpeed;//移动速度

    public static void main(String[] args) {
        Hero garen =  new Hero();
        garen.name = "盖伦";
        garen.hp = 616.28f;
        garen.armor = 27.536f;
        garen.moveSpeed = 350;

        Hero teemo =  new Hero();
        teemo.name = "提莫";
        teemo.hp = 383f;
        teemo.armor = 14f;
        teemo.moveSpeed = 330;

        System.out.println(garen);
        System.out.println(teemo);
    }
}
