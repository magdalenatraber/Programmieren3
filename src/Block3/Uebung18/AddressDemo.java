package Block3.Uebung18;

import java.io.File;
import java.io.IOException;

public class AddressDemo {
    public static void main(String[] args)  {
        Addressmanager addressmanager = new Addressmanager();
        String separator = ";";
        addressmanager.add(new Address("Susi","Sorglos","0664123456","susi.sorglos@yahoo.com"));
        addressmanager.add(new Address("Dominik","Neumeister","0664177456","dominik.n@gmx.com"));
        addressmanager.add(new Address("Robin","Gutmann","068145753456","robin.gutmann@yahoo.com"));
        addressmanager.add(new Address("Manuel","Strauss","06904123456","manuel.strauss@yahoo.com"));

        File file = new File("addresses.csv");
        try {
            addressmanager.exportToCsv(file.getAbsolutePath(),separator);
        } catch (AddressExportException | AddressExportAlreadyExistsException e) {
            e.printStackTrace();
        }


        try {
            addressmanager.loadFromCsv(file.getAbsolutePath(),separator);
        } catch (AddressLoadException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (AddressLoadWrongFormatException e) {
            e.printStackTrace();
        }
        System.out.println(addressmanager.getAddresses().toString());

    }
}
