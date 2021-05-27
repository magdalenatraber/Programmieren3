package Block3.Uebung18;

import Block3.Uebung17.Produkt;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Addressmanager {

    private ArrayList<Address> addresses = new ArrayList<>();

    @Override
    public String toString() {
        return "Addressmanager{" +
                "addresses=" + addresses +
                '}';
    }

    public ArrayList<Address> getAddresses() {
        return addresses;
    }

    public void add(Address a) {
        addresses.add(a);
    }

    public void exportToCsv(String path, String separator) throws AddressExportException, AddressExportAlreadyExistsException {
        File file = new File(path);
        if (file.exists()) {
            throw new AddressExportAlreadyExistsException("File already exists");
        }
        try {
            FileWriter fileWriter = new FileWriter(path);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Address address : addresses) {
                bufferedWriter.write(address.getFirstname() + separator + address.getLastname() + separator + address.getMobilNumber() + separator + address.getEmail());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (
                IOException e) {
            throw new AddressExportException("Error");
        }
    }

    public void loadFromCsv(String path, String separator) throws AddressLoadException, IOException, AddressLoadWrongFormatException {
        addresses.removeAll(addresses);
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] tempp = line.split(separator);

            if (tempp.length != 4) {
                throw new AddressLoadWrongFormatException("nicht im richtigen Format");
            }

            addresses.add(new Address(tempp[0], tempp[1], tempp[2], tempp[3]));
        }

    }
    }
