package Block3.Uebung17;

import java.io.File;
import java.io.IOException;

public class MainDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
    ProduktManager produktManager = new ProduktManager();

    produktManager.add(new Produkt("Tisch",100.00,"Moebel"));
    produktManager.add(new Produkt("Sessel",100.00,"Moebel"));
    produktManager.add(new Produkt("Sofa",200.00,"Moebel"));
    produktManager.add(new Produkt("Schwamm",30.00,"Utensil"));
    produktManager.add(new Produkt("Buerste",10.00,"Utensil"));

    File file = new File("ue17.txt");
produktManager.save(file.getAbsolutePath());
produktManager.read(file.getAbsolutePath());

    }
}
