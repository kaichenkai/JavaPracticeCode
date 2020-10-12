package 面向对象.demo03;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author: kaichenkai
 * @create: 9/17/2020 20:06
 * 群主类
 */
public class Manager extends User {
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    //发红包
    public ArrayList<Integer> send() {
        while (true) {
            //确定发多少钱, 发多少个?
            Scanner scanner = new Scanner(System.in);
            int money = scanner.nextInt();
            int count = scanner.nextInt();
            if (money > this.getMoney()) {
                String str = String.format("your balance is %d! place re-select", this.getMoney());
                System.out.println(str);
                continue;
            }
            //确定每个红包有多少钱?
            int avg = money / count;
            int remainder = money % count; //余数, 就是零头

            //塞钱进红包, 使用集合表示红包
            ArrayList<Integer> set = new ArrayList<>();
            for (int i = 0; i < count - 1; i++) {
                set.add(avg);
            }

            //把零头塞进最后一个红包里面
            set.add(avg + remainder);

            //减去余额
            this.setMoney(this.getMoney() - money);
            return set;
        }
    }
}
