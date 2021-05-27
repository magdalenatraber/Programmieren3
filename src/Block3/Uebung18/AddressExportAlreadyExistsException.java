package Block3.Uebung18;

public class AddressExportAlreadyExistsException extends Throwable {
    public AddressExportAlreadyExistsException(String file_already_exists) {
        super(file_already_exists);
    }
}
