package Block1;

import java.io.File;

public class Uebung3 {public static void main(String[] args) {
    giveAllFilesinDirectory(new File("C:\\Users\\Magdalena\\IdeaProjects\\Fächer\\Programmieren 3"));
}

    public static void giveAllFilesinDirectory(File file) {

        File[] listFiles = file.listFiles();
        System.out.println("List of Files: ");
        for (File f : listFiles) {
            if(f.isDirectory()) {
                System.out.println("Directory:" + f.getAbsoluteFile());
                giveAllFilesinDirectory(f);
            }
            else
                System.out.println("File: " + f.getAbsoluteFile());
        }

    }

}

