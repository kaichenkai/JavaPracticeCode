package IO操作;

import java.io.*;

/**
 * @author: kaichenkai
 * @create: 6/28/2020 19:09
 */
public class Demo06Reader {
    public static void main(String[] args) {
        File file = new File("test");
        try(Reader fr = new FileReader(file)) {
            char[] chars = new char[(int) file.length()];
            fr.read(chars);
            for (char c : chars) {
                System.out.println(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
