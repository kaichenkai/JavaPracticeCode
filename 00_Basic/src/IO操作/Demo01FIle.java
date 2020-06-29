package IO操作;

import java.io.File;
import java.io.IOException;

/**
 * @author: kaichenkai
 * @create: 6/11/2020 11:26
 */
public class Demo01FIle {
    public static void main(String[] args) throws IOException {
        System.out.println(File.separator);
        File file = new File("test");
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.exists());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        //需要在D:\LOLFolder确实存在一个LOL.exe,才可以看到对应的文件长度、修改时间等信息, 否则都返回 0
        System.out.println(file.length());
        System.out.println(file.lastModified());
        //文件重命名
        File file2 = new File("test2");
        file.renameTo(file2);
        System.out.println(file.getName());
    }
}
