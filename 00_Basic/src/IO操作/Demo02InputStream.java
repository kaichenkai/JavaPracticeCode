package IO操作;

import java.io.*;

/**
 * @author: kaichenkai
 * @create: 6/11/2020 11:42
 * 0. InputStream 字节输入流
 * 1. 自动关闭流对象  try (resource) {...}
 * 2. read() 没有指定字节数时, 默认读取单个字节, 返回的是字节表示的 int 值 (0-255)
 */
public class Demo02InputStream {
    public static void main(String[] args) throws IOException {
//        File file = new File("E:\\temp\\20200608\\123456");
//        if (!file.exists()) {
//            String filePath = file.getAbsolutePath();
//            System.out.println(String.format("文件不存在: %s", filePath));
//            return;
//        }
        File file = new File("test2");
        //对象是否实现了java.lang.AutoCloseable接口，如果实现了，就自动加上finally语句并调用close()方法
        //InputStream和OutputStream都实现了这个接口，因此，都可以用在try(resource)中
        try (InputStream is = new FileInputStream(file)) { // 相当于 python 中的 with open 上下文写法
            byte[] bytes = new byte[(int) file.length()];
            is.read(bytes);
            for (byte b : bytes) {
                System.out.println(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
