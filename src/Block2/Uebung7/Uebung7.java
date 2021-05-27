package Block2.Uebung7;

import java.io.*;

public class Uebung7 {
    public static void main(String[] args) throws IOException {
        File file = new File("hallo.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }

        bufferedReader.close();
    }


}
