package Block1;

import java.io.File;
import java.util.Scanner;

public class Uebung1 {
    public static void main(String[] args) {
readFileInformation(new File("Programmieren 3.iml"));

 /*       - Does this file exist?
        - Name of the File
                - Parent Directory of the File
        - Path to this File
                - Is this a directory?
        - Is this a file?
        - Is this file readable?
        - Is this File writeable
        - File Size*/

    }

    public static void readFileInformation(File file){
        System.out.println("File exists?" + file.exists());
        System.out.println("The name of the file is" + file.getName());
        System.out.println("Parent Directory: " + file.getParent());
        System.out.println("Path: " + file.getAbsolutePath());
        System.out.println("File ?:" + file.isFile());
        System.out.println("Directory ?:" + file.isDirectory());
        System.out.println("Hidden?: " + file.isHidden());
        System.out.println("Readable ?:" +file.canRead());
        System.out.println("Writeable ?:" +file.canWrite());
        System.out.println("file size ?:" +file.length());
    }
}
