package Block1;

import java.io.File;
import java.io.IOException;

public class Uebung5 {

    public static void main(String[] args) {
     /*   Tip: use mkdirs()
        Write a method, which creates multiple directories. Example: "C:\\campus02\\test\\demo4" (Campus, Test, Demo4 will be created)
        - It should also be checked, if the given directory has been created -> print it to the console:
            -> IF Yes: Directory C:\campus02\test\demo4  created?: false
            -> IF No: Directory C:\campus02\test\demo4  created?: true

        Question: What is the difference between mkdirs() and mkdir() ?
                Question: What does mkdirs() return?
        Question: What does mkdir() return?*/
        File dir = new File("test5");

        System.out.println(dir.isDirectory());
        try {
            if (dir.mkdirs()) {
                System.out.println(dir.getAbsolutePath() + "FileName" + dir.getName());
                System.out.println("uri: " + dir.toURI());
                System.out.println("path" + dir.getPath());
                System.out.println("new File created");
            } else {
                System.out.println("File already existed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
