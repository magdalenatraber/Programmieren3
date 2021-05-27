package Block3.Uebung13;

import java.io.*;

public class BinaryInput {
    public static void main(String[] args) throws IOException {
        File file = new File("producte.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        int byteRead;
        while ((byteRead = bufferedInputStream.read()) != -1){
            System.out.println((char) byteRead);
        }



    }
}
