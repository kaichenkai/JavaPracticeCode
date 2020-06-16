package IO操作;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author: kaichenkai
 * @create: 6/11/2020 11:42
 * 读取指定字节数, 创建 buffer 缓冲数组
 */
public class Demo03InputStream {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\temp\\20200608\\123456");
        if (!file.exists()) {
            String filePath = file.getAbsolutePath();
            System.out.println(String.format("文件不存在: %s", filePath));
            return;
        }
        try (InputStream is = new FileInputStream(file)) { // 相当于 python 中的 with open 上下文写法
            int n;
            int count = 0;
            byte[] buffer = new byte[1024];
            while ((n = is.read(buffer)) != -1) {
                count += n;
                System.out.println(n);
            }
            System.out.println(count);  // 输出读取大小与文件大小相同 : 847691
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
