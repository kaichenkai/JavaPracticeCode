package atemp.threadDemo;

/**
 * @author: kaichenkai
 * @create: 6/30/2020 18:22
 */
public class Main {
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

        //继承Thread方式
//        AsyncThread asyncThread1 = new AsyncThread(gareen, teemo);
//        asyncThread1.start();
//        AsyncThread asyncThread2 = new AsyncThread(adc, leesin);
//        asyncThread2.start();

        //实现Runnable方式
        AsyncRunnable asyncRunnable1 = new AsyncRunnable(gareen, teemo);
        AsyncRunnable asyncRunnable2 = new AsyncRunnable(adc, leesin);
        Thread thread1 = new Thread(asyncRunnable1);
        thread1.start();
        Thread thread2 = new Thread(asyncRunnable2);
        thread2.start();
    }
}
