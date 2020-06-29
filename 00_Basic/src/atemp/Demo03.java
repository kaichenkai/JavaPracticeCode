package atemp;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: kaichenkai
 * @create: 6/23/2020 11:30
 */
public class Demo03 {
    public static void main(String[] args) {
        //Arrays
        int[] a = new int[] { 18, 62, 68, 82, 65, 62, 9 };
        //copy array
        int[] b = Arrays.copyOfRange(a, 0, 3);
        //toString()
        System.out.println(Arrays.toString(b));
        //binarySearch()， 查找某个元素的索引
        System.out.println(Arrays.binarySearch(a, 62));//返回第一个元素所在的索引值
        System.out.println(Arrays.binarySearch(a, 63));//没有找到返回 -3
        System.out.println(Arrays.binarySearch(a, 64));//没有找到返回 -3
        //判断数组是否相同

    }
}
