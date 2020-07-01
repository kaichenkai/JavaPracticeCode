package atemp.threadDemo;

/**
 * @author: kaichenkai
 * @create: 6/30/2020 17:57
 */
public class AsyncThread extends Thread {
    private Hero hero1;
    private Hero hero2;

    public AsyncThread(Hero hero1, Hero hero2) {
        this.hero1 = hero1;
        this.hero2 = hero2;
    }

    @Override
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

