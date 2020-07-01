package atemp.threadDemo;

/**
 * @author: kaichenkai
 * @create: 6/30/2020 18:02
 */
public class Hero {
    private String name;
    private float hp;
    private int damage;

    public Hero() {
    }

    public Hero(String name, float hp, int damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    public void attackHero(Hero h) throws InterruptedException {
        Thread.sleep(1000);
        h.hp -= this.damage;//
        System.out.format("%s 在攻击 %s, %s 的 hp 变成了 %.0f%n", this.name, h.name, h.name, h.hp);
        if (h.isDead()) {
            System.out.format("%s 已经挂了%n", h.name);
        }
    }

    public boolean isDead(){
        return this.hp <= 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
