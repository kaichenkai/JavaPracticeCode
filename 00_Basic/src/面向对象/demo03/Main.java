package 面向对象.demo03;

import java.util.ArrayList;

/**
 * @author: kaichenkai
 * @create: 9/17/2020 20:18
 */
public class Main {
    public static void main(String[] args) {
        //建群拉人
        Manager manager = new Manager("Manager", 100);
        Member memberA = new Member("mbA", 0);
        Member memberB = new Member("mbB", 0);
        Member memberC = new Member("mbC", 0);
        manager.show();
        memberA.show();
        memberB.show();
        memberC.show();

        //发红包
        ArrayList<Integer> set = manager.send();

        //收红包
        memberA.receive(set);
        memberB.receive(set);
        memberC.receive(set);

        //活动结束
        manager.show();
        memberA.show();
        memberB.show();
        memberC.show();
    }
}
