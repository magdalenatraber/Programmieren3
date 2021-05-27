package Block3.Uebung15;

import java.io.*;

public class Uebung15 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

      String s = "Hello World";
      byte[] b = {'e','x','a','m','p','l','e','e',};
        File file = new File("ue15.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
     ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

     objectOutputStream.writeObject(s);
     objectOutputStream.writeObject(b);
     objectOutputStream.flush();
     objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        System.out.println(objectInputStream.readObject());




    }
    }
