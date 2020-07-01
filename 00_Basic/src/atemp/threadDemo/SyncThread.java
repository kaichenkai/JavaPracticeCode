package atemp.threadDemo;

/**
 * @author: kaichenkai
 * @create: 6/30/2020 17:57
 */
public class SyncThread {
    public static void main(String[] args) throws InterruptedException {
        Hero gareen = new Hero("gareen", 616, 50);
        Hero teemo = new Hero("teemo", 300, 50);
        Hero adc = new Hero("adc", 500, 65);
        Hero leesin = new Hero("leesin", 455, 80);

        //gareen attack teemo
//        while (!teemo.isDead()) {
//            gareen.attackHero(teemo);
//        }
        //adc attack leesin
//        while (!leesin.isDead()) {
//            adc.attackHero(leesin);
//        }
        AsyncThread asyncThread1 = new AsyncThread(gareen, teemo);
        asyncThread1.start();
        AsyncThread asyncThread2 = new AsyncThread(adc, leesin);
        asyncThread2.start();
    }
}

