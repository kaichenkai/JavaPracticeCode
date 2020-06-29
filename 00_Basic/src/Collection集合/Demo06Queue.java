package Collection集合;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: kaichenkai
 * @create: 5/29/2020 09:59
 *
 * 使用 LinkedList实现 Queue接口, 测试接口的操作方法
 */
public class Demo06Queue {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        //添加元素
        System.out.println(q.add("AppleOne"));//true
        System.out.println(q.offer("AppleTwo"));//true
        System.out.println(q.offer("AppleThree"));//true
        System.out.println(q.offer("AppleFour"));//true
        //取出元素并删除
        System.out.println(q.remove());
        System.out.println(q.poll());
        //取出元素不删除
        System.out.println(q.element());//
        System.out.println(q.peek());//反复获取
        System.out.println(q);
        System.out.println(q.size());//获取长度
    }
}
