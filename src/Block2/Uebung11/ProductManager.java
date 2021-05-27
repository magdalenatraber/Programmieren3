package Block2.Uebung11;

import java.io.*;
import java.util.ArrayList;

public class ProductManager {
    private ArrayList<Product> products;

    public ProductManager(){
        products = new ArrayList<>();
    }

    public void add(Product p){
        products.add(p);
    }

    public void saveToFile(String path) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Product product : products) {
            {
                bufferedWriter.write(product + "\n");
            }
        }
       bufferedWriter.flush();
            bufferedWriter.close();
    }
    public void readFromFile(String path) throws IOException {
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();

    }

    }

