package atemp.threadDemo;

/**
 * @author: kaichenkai
 * @create: 6/30/2020 18:22
 */
public class AsyncRunnable implements Runnable{
    private Hero hero1;
    private Hero hero2;

    public AsyncRunnable(Hero hero1, Hero hero2) {
        this.hero1 = hero1;
        this.hero2 = hero2;
    }

    public void run() {
        //hero1 attack hero2
        while (!hero2.isDead()) {
            try {
                hero1.attackHero(hero2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
