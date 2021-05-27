package Block2.Uebung9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Uebung9 {
    public static void main(String[] args) throws IOException {
        File file = new File("hallo.txt");

        FileWriter fileWriter = new FileWriter(file);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        printWriter.println("Firsln");
        printWriter.println("Secondln");

        printWriter.flush();
        printWriter.close();
    }
}
