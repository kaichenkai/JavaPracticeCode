package Collection集合;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: kaichenkai
 * @create: 5/28/2020 19:22
 */
public class Demo05Set {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        //添加元素
        System.out.println(set.add("xiaohong"));//添加成功返回true
        System.out.println(set.add("aaa"));//添加成功返回true
        System.out.println(set.add("bbb"));//添加成功返回true
        //删除元素
        System.out.println(set.remove("xiaohong"));//删除成功返回true
        System.out.println(set.remove("test"));//删除失败返回false, py中删除失败报错
        //输出Set长度
        System.out.println(set.size());//2
    }
}
