package Block3.Uebung14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryOutput {
    public static void main(String[] args) throws IOException {
        File file = new File("hallo.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);

        String outputText = "Hello File = first output";

        for (char c : outputText.toCharArray()) {
            fileOutputStream.write(c);
        }
        fileOutputStream.flush();
        fileOutputStream.close();
    }
}
