package Block1;

import java.io.File;
import java.io.IOException;

public class CreationOfFiles {
    public static void main(String[] args) {

        String fileSeparator = System.getProperty("file.separator");
        System.out.println("fileSeparator = " + fileSeparator);


        File file = new File("campus2-test.txt");
     //   File file2 = new File("C:" + fileSeparator + "Users" + fileSeparator + "Magdalena" + fileSeparator + "andererText.txt");
      File file3 = new File("C:\\Users\\Magdalena\\IdeaProjects\\Fächer\\Programmieren 3\\test-mp3");
        try {
            if (file3.createNewFile()) {
                System.out.println(file3.getAbsolutePath() + "FileName" + file.getName());
                System.out.println("uri: " + file3.toURI());
                System.out.println("path" + file3.getPath());
                System.out.println("new File created");
            } else {
                System.out.println("File already existed");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
