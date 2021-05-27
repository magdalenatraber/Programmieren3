package Block3.Uebung13;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Uebung13 {
    public static void main(String[] args) throws IOException {
        File file = new File("hallo.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        int counter = 0;
        int byteRead;
        while ((byteRead = bufferedInputStream.read()) != -1){

            System.out.print((char) byteRead);
            if(Character.isLetter((char) byteRead))
            ++counter;
        }
        fileInputStream.close();
        System.out.println();
        System.out.println("Gesamtzahl: " +counter);


    }
}

