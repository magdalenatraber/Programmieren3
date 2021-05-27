package Block2.Uebung8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uebung8ExceptionHandling {    public static void main(String[] args) {

read();
}

public static void read(){
        String stop = "STOP";
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("Bitte gib was ein.");
        String line;

        try {
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                if (line.equals(stop)) {
                    break;
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Programm beendet");
        }
    }
}



