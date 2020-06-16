package IO操作;

import jdk.internal.util.xml.impl.Input;

import java.io.*;

/**
 * @author: kaichenkai
 * @create: 6/11/2020 11:42
 * ByteArrayInputStream 可以在内存中模拟一个 InputStream
 */
public class Demo04ByteArrayInputStream {
    public static void main(String[] args) {
        //
        byte[] bData = new byte[]{72, 101, 108, 108, 111, 33};
        try (InputStream is = new ByteArrayInputStream(bData)) {
            String retStr = readChar(is);
            System.out.println(retStr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readChar(InputStream input) throws IOException {
        int n;
        StringBuffer sb = new StringBuffer();
        while ((n = input.read()) != -1) {
            sb.append((char) n);
        }
        return sb.toString();
    }
}
