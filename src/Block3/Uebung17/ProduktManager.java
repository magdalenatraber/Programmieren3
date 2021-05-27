package Block3.Uebung17;

import Block2.Uebung11.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProduktManager {
    private ArrayList<Produkt> products;

    public ProduktManager() {
        products = new ArrayList<>();
    }

    public void add(Produkt p) {
        products.add(p);
    }

    public void save(String path) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        for (Produkt produkt : products) {
            objectOutputStream.writeObject(produkt);
        }
        objectOutputStream.flush();
        objectOutputStream.close();
    }

    public void read(String path) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        List<Produkt> productList = new ArrayList<>();

        // boolean keepReading = true;
        try {
            while (true) {
                Object object = objectInputStream.readObject();
                Produkt p = (Produkt) object;
                productList.add(p);
                System.out.println(p);
            }
        } catch (EOFException e) {
            System.out.println("End of File reached.");
            // keepReading = false;
        } finally {
            objectInputStream.close();
        }
        System.out.println("Read Object data: ");
        System.out.println(productList);

    }
}
