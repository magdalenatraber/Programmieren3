package Block1;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class Uebung6 {
    public static void main(String[] args) {
  /*      Goal: Create 10 Files + Rename all files (only files) of the given directory (not for subdirectories)

        1. Create a method, which creates 10 files, in a givern directory (= Method Parameter) and with a random file name/number (Tip: concatenate for final filepath)
        2. Create a method, which renames all files (only files and not directories!) within a given folder (= Method Parameter)
        2.1 for example: test.txt to 1_test.txt
        2.1.1 for the new file name - concatenate a string with .getParent(), seperator + getName()
        2.1.2 use renameTo() method
        2.1.3 Check if the rename was a success (via if) and print the according message to the console
        3. Write a method, which deletes all files within this directory. (Comment out this or other methods to test it..)
        Tip: Random Number:
    ThreadLocalRandom.current().nextInt()
*/

        File source = new File("test\\alt");
        source.mkdirs();
        createFiles(source);

    }

    public static void createFiles(File file){

     /*   for (int i = 0; i < 10; i++) {
            File test = new File(file.getAbsolutePath() + File.separator + ThreadLocalRandom.current().nextInt() + ".mp3");
            if(test.createNewFile())
                System.out.println("Create: " + test.getAbsolutePath());
        else {System.out.println("ERROR");}
        }*/

    }
}