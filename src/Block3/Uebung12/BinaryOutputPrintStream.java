package Block3.Uebung12;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class BinaryOutputPrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        String data = "das ist ein Test";
        PrintStream output = new PrintStream("hallo.txt");
        output.print(data);
        output.flush();
        output.close();
    }
}
