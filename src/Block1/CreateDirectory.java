package Block1;

import java.io.File;
import java.util.Scanner;

public class CreateDirectory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Directory, which should be created: ");
        String path = scanner.next();
        File file = new File(path);

        boolean created = file.mkdir();

        if (created) {
            System.out.println("Directory was created");
        } else {
            System.out.println("Does already exist");
        }
    }
}