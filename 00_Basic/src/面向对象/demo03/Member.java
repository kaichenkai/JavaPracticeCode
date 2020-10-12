package 面向对象.demo03;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author: kaichenkai
 * @create: 9/17/2020 20:14
 */
public class Member extends User {
    public Member() {

    }

    public Member(String name, int money) {
        super(name, money);
    }

    //收红包
    public void receive(ArrayList<Integer> set){
        //随机收取一个红包
        Random random = new Random();
        int index = random.nextInt(set.size());
        int cash = set.remove(index);
        String str = String.format("i got was %d yuan", cash);
        System.out.println(str);
        //修改余额
        this.setMoney(this.getMoney() + cash);
    }
}
