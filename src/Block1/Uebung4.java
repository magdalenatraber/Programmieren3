package Block1;

import java.io.File;

public class Uebung4 {
    public static void main(String[] args) {
        giveAllFilesinDirectory(new File("C:\\Users\\Magdalena\\IdeaProjects\\Fächer\\Programmieren 3"));
    }

    public static void giveAllFilesinDirectory(File file) {

        File[] listFiles = file.listFiles();
        System.out.println("List of Files: ");
        long size = 0;
        for (File f : listFiles) {
            if (f.isFile()) {
                System.out.println("---------------------------------");
                System.out.println("Filename: " + f.getName());
                System.out.println("Path: " + f.getAbsolutePath());
                System.out.println("Size: " + f.length());
                size += f.length();

            } else {
                System.out.println("No Directory");
            }

        }
        System.out.println("Gesamtgroesse: " + size);

    }

}

