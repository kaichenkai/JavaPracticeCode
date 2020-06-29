package atemp;

/**
 * @author: kaichenkai
 * @create: 6/28/2020 15:51
 */
public class Demo11StringBuffer {
    public static void main(String[] args) {
//        String testStr = "abcdefg";
//        StringBuffer stringBuffer = new StringBuffer(testStr);
//        stringBuffer.delete(1, 4);//顾前不顾尾
//        System.out.println(stringBuffer);
//        stringBuffer.insert(1, "bcd");
//        System.out.println(stringBuffer);
//        //反转
//        stringBuffer.reverse();
//        System.out.println(stringBuffer);


        String str1 = "the";
        StringBuffer stringBuffer = new StringBuffer(str1);
        System.out.println(stringBuffer.length());//内容长度
        System.out.println(stringBuffer.capacity());//总空间
    }
}
