package Collection集合;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author: kaichenkai
 * @create: 5/29/2020 11:00
 * Iterator 接口, 迭代
 */
public class Demo07Iterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        // 最初写法
        for (Iterator it = list.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }

        // foreach 循环
        for (String s : list) {
            System.out.println(s);
        }
    }
}
