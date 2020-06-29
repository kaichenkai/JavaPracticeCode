package IO操作;

import java.io.*;

/**
 * @author: kaichenkai
 * @create: 6/28/2020 20:18
 */
public class Demo08BufferedOutputStream {
    public static void main(String[] args) {
        File file = new File("test");
        //缓存流必须建立在一个存在的流的基础上
        try(OutputStream os = new FileOutputStream(file);
            BufferedOutputStream bos = new BufferedOutputStream(os)
        ) {
            byte[] bData = new byte[] {72, 101, 108, 108, 111};
            bos.write(bData);
            //强制把缓存中的数据写入硬盘，无论缓存是否已满
            bos.flush();
            byte[] cData = new byte[] {72, 101, 108, 108, 111};
            bos.write(cData);
        }
         catch (IOException e) {
            e.printStackTrace();
        }
    }
}
