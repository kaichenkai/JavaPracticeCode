package 面向对象.demo04;

import java.awt.event.KeyEvent;

/**
 * @author: kaichenkai
 * @create: 9/18/2020 19:59
 */
public class MacBookPro {
    public void powerOn() {
        System.out.println("powerOn");
    }

    public void powerOff() {
        System.out.println("powerOff");
    }

    //使用 usb 设备的方法, 使用接口作为方法的参数
    public void useDevice(USB usb) {
        usb.enable();
        if (usb instanceof Mouse) {
            //"向下转型"
            Mouse mouse = (Mouse) usb;
            mouse.click();
        } else if (usb instanceof KeyBoard) {
            KeyBoard keyBoard = (KeyBoard) usb;
            keyBoard.tap();
        }
        usb.disable();
    }
}
