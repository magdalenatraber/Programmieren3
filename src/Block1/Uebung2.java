package Block1;

import java.io.File;
import java.util.Arrays;

public class Uebung2 {
    public static void main(String[] args) {
        giveAllFilesinDirectory(new File("C:\\Users\\Magdalena\\IdeaProjects\\Fächer\\Programmieren 3"));
    }

    public static void giveAllFilesinDirectory(File file) {
file.getParent();
        File[] listFiles = file.listFiles();
        System.out.println("List of Files: ");
        for (int i = 0; i < listFiles.length; i++) {
            if(listFiles[i].isDirectory())
            System.out.println("Directory:" +listFiles[i]);
           else
                System.out.println("File: " + listFiles[i]);
            }

        }

        }

