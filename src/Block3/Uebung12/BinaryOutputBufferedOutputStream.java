package Block3.Uebung12;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class BinaryOutputBufferedOutputStream {
    public static void main(String[] args) throws IOException {
        File file = new File("hallo.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

        bufferedOutputStream.write("Hello".getBytes(StandardCharsets.UTF_8));
        bufferedOutputStream.write(System.lineSeparator().getBytes(StandardCharsets.UTF_8));
        bufferedOutputStream.write("New -line".getBytes(StandardCharsets.UTF_8));
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }
}
