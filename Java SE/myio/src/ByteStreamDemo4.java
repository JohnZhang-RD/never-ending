import java.io.FileInputStream;
import java.io.IOException;

/**
 * Name: ByteStreamDemo4
 * Package: PACKAGE_NAME
 * Description:
 *
 * @author Junhui Zhang
 * @Date: 2024/05/20 - 22:51
 * @Version: v1.0
 */

public class ByteStreamDemo4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("a.txt");

        int b;
        while ((b = fis.read()) != -1) {
            System.out.println((char) b);
        }

        fis.close();
    }
}
