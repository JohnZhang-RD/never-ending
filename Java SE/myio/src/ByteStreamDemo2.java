import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Name: ByteStreamDemo2
 * Package: PACKAGE_NAME
 * Description:
 *
 * @author Junhui Zhang
 * @Date: 2024/05/19 - 20:33
 * @Version: v1.0
 */

public class ByteStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("a.txt");
        byte[] bytes = {97, 98, 99, 100};
//        fos.write(bytes);
        fos.write(bytes, 1,2);
        fos.close();
    }
}
