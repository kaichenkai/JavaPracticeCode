package atemp;

import java.util.Scanner;

/**
 * @author: kaichenkai
 * @create: 6/23/2020 11:30
 */
public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(a);
        int b = scanner.nextInt();
        System.out.println(b);

        //读取字符串
        Scanner scanner2 = new Scanner(System.in);
        String c = scanner2.nextLine();
        System.out.println(c);
        String d = scanner2.nextLine();
        System.out.println(d);
    }
}
