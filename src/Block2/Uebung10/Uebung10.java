package Block2.Uebung10;

import java.io.*;

public class Uebung10 {
    public static void main(String[] args) throws IOException {
        File file = new File("noten.txt");

        FileWriter fileWriter = new FileWriter(file);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


        printWriter.write(" alle Noten dieses Semesters: \n ");
        System.out.println("Bitte Noten eingeben:");
        String line;
        while ((line = bufferedReader.readLine()) != null){
            if(line.equals("STOP"))
            break;
        else{
                System.out.println(line);

            printWriter.write(line + "\n");

            }
            }
        System.out.println("Programm beendet");
        bufferedReader.close();
        printWriter.flush();
        printWriter.close();
    }
}
