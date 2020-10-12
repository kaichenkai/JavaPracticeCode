package 面向对象.demo04;

/**
 * @author: kaichenkai
 * @create: 9/18/2020 20:07
 */
public class Main {
    public static void main(String[] args) {
        MacBookPro book = new MacBookPro();

        USB mouse = new Mouse();
        USB keyBoard = new KeyBoard();

        book.powerOn();
        book.useDevice(mouse);
        book.useDevice(keyBoard);

        book.powerOff();
    }
}
