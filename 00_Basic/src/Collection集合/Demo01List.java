package Collection集合;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author: kaichenkai
 * @create: 5/27/2020 17:20
 * List 和 Array 的相互转换
 */
public class Demo01List {
    public static void main(String[] args) {
        // List --> Array
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        Integer[] array = list.toArray(new Integer[list.size()]); //将 List --> Array
//        System.out.println(Arrays.toString(array)); //[xiaoming, xiaohong]

        // Array --> List
//        String[] arr = new String[] {"1", "2", "3"};
//        List<String> list = Arrays.asList(arr);
//        for (String s : list) {
//            System.out.println(s);
//        }

        // 小练习
        // 构造从start到end的序列：
        final int start = 10;
        final int end = 20;
        List<Integer> list = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            list.add(i);
        }
        // 随机删除List中的一个元素:
        // 洗牌算法shuffle可以随机交换List中的元素位置:
        Collections.shuffle(list);
        Collections.sort(list);
        int removed = list.remove((int) (Math.random() * list.size()));
        int found = findMissingNumber(start, end, list);
        System.out.println(list.toString());
        System.out.println("missing number: " + found);
        System.out.println(removed == found ? "测试成功" : "测试失败");
    }

    static int findMissingNumber(int start, int end, List<Integer> list) {
        int currentNum = 10;
        for (Integer integer : list) {
            if (currentNum == integer) {
                currentNum = integer + 1;
            } else {
                return currentNum;
            }
        }
        return 20;
    }
}
