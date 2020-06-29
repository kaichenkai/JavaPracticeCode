package atemp;

/**
 * @author: kaichenkai
 * @create: 6/28/2020 10:23
 */
public class Demo10Format {
    public static void main(String[] args) {
        int year = 2020;
        System.out.println(year);
        System.out.format("%d%n", year);
        System.out.format("%8d%n", year);
        System.out.format("%-8d%n", year);
        System.out.format("%08d%n", year);
        System.out.format("%,8d%n", year*10000);//千位分隔符
        System.out.println(Math.PI);//π的值
        System.out.format("%.2f%n", Math.PI);//保留两位小数

        //

    }
}
