package IO操作;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @author: kaichenkai
 * @create: 6/28/2020 19:15
 */
public class Demo07Writer {
    public static void main(String[] args) {
        File file = new File("test");
        try(Writer writer = new FileWriter(file)) {
            char[] chars = new char[]{'中', '国'};
            writer.write(chars);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
