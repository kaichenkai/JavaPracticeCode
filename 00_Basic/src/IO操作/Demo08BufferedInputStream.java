package IO操作;

import java.io.*;

/**
 * @author: kaichenkai
 * @create: 6/28/2020 20:18
 */
public class Demo08BufferedInputStream {
    public static void main(String[] args) {
        File file = new File("test");
        //缓存流必须建立在一个存在的流的基础上
        try(InputStream is = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(is)
        ) {
            byte[] bytes = new byte[(int) file.length()];
            bis.read(bytes);
            for (byte b : bytes) {
                System.out.println(b);
            }
        }
         catch (IOException e) {
            e.printStackTrace();
        }
    }
}
