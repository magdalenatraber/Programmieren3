package Block2.Uebung11;

import java.io.File;
import java.io.IOException;

public class MainDemo {
    public static void main(String[] args) throws IOException {
    ProductManager productManager = new ProductManager();

    productManager.add(new Product("Tisch",100.00,"Moebel"));
    productManager.add(new Product("Sessel",100.00,"Moebel"));
    productManager.add(new Product("Sofa",200.00,"Moebel"));
    productManager.add(new Product("Schwamm",30.00,"Utensil"));
    productManager.add(new Product("Buerste",10.00,"Utensil"));

    File file = new File("producte.txt");
    productManager.saveToFile(file.getAbsolutePath());
    productManager.readFromFile(file.getAbsolutePath());

    }
}
