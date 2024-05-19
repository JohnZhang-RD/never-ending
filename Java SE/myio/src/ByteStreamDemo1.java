import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Name: ByteStreamDemo1
 * Package: PACKAGE_NAME
 * Description:
 *
 * @author Junhui Zhang
 * @Date: 2024/05/19 - 20:06
 * @Version: v1.0
 */

public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("a.txt");
        fos.write(97);
        fos.close();
    }
}
