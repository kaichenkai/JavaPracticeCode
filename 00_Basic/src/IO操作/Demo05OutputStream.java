package IO操作;

import java.io.*;
import java.util.Arrays;

/**
 * @author: kaichenkai
 * @create: 6/11/2020 15:45
 * OutputStream: 输出流, 输出到文件
 * 支持每次写一个字节, 也可以写 byte[]
 */
public class Demo05OutputStream {
    public static void main(String[] args) {  // 写入 HelloWorld
//        byte[] bData = new byte[] {72, 101, 108, 108, 111};
        File file = new File("test");
        try (OutputStream output = new FileOutputStream(file)) {
            byte[] bytes = new byte[] {64, 65};
            output.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public static void simpleWrite(OutputStream output) throws IOException {
//        output.write("World".getBytes("UTF-8"));
//    }
}
