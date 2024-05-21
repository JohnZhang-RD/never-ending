import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * Name: ByteStreamDemo3
 * Package: PACKAGE_NAME
 * Description:
 *
 * @author Junhui Zhang
 * @Date: 2024/05/20 - 17:33
 * @Version: v1.0
 */

public class ByteStreamDemo3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("a.txt", true);
        String msg = "Hello IO Stream";
        byte[] bytes = msg.getBytes(StandardCharsets.UTF_8);
        fos.write(bytes);

        String e = "\r\n";
        byte[] bytes1 = e.getBytes(StandardCharsets.UTF_8);
        fos.write(bytes1);

        String msg2 = "Hello IO Stream";
        byte[] bytes2 = msg2.getBytes(StandardCharsets.UTF_8);
        fos.write(bytes2);

        fos.close();
    }
}
