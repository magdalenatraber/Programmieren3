package Block2.Uebung7;

import java.io.*;

public class Uebung7ExceptionHandling {
    public static void main(String[] args) {
        File file = new File("hallo.txt");
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while (true){
            try {
                if (!((line = bufferedReader.readLine()) != null))
                    System.out.println(line);
                break;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

