package IO操作;

import java.io.*;

/**
 * @author: kaichenkai
 * @create: 6/11/2020 15:45
 * OutputStream: 输出流, 输出到文件
 * 支持每次写一个字节, 也可以写 byte[]
 */
public class Demo04OutputStream {
    public static void main(String[] args) {  // 写入 HelloWorld
//        byte[] bData = new byte[] {72, 101, 108, 108, 111};
        File file = new File(".\\00_Basic\\src\\IO操作\\test.txt");
        try (OutputStream output = new FileOutputStream(file)) {
            output.write(72);
            output.write(101);
            output.write(108);
            output.write(108);
            output.write(111);
            simpleWrite(output);
            System.out.println("内容写入完成");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void simpleWrite(OutputStream output) throws IOException {
        output.write("World".getBytes("UTF-8"));
    }
}
