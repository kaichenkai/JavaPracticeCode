package atemp;

/**
 * @author: kaichenkai
 * @create: 6/24/2020 17:55
 */
public class Demo09String {
    public static void main(String[] args) {
//        int i = 2;
//        String str = String.valueOf(i);
//        System.out.println(str);
//
//        String s = "eee23";
////        int j = Integer.parseInt(s);
//        System.out.println(Integer.valueOf(i).toString().getClass());

//        float f = 3.14F;
//        String str1 = String.valueOf(f);
//        System.out.println(str1);
//        f = Float.parseFloat(str1);
//        System.out.println(f);
//
//        String str2 = "3.1a4";
//        f = Float.parseFloat(str2);
//        System.out.println(f);

        String name = "garen";
        int kill = 8;
        String title = "chaoshen";

        String sentenceFormat = "  %s zaijinxingle lianxu jisha %d ci hou, huodele %s chenghao %n               ";
        System.out.println(sentenceFormat.trim());

        System.out.printf(sentenceFormat, name, kill, title);
        System.out.println(title.charAt(0));
    }
}
