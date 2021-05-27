package Block3.Uebung18;

public class Address {
    private String firstname, lastname, mobilNumber,email;

    public Address(String firstname, String lastname, String mobilNumber, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.mobilNumber = mobilNumber;
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMobilNumber() {
        return mobilNumber;
    }

    public void setMobilNumber(String mobilNumber) {
        this.mobilNumber = mobilNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Address{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", mobilNumber='" + mobilNumber + '\'' +
                ", email='" + email + '\'' +
                '}' + "\b";
    }
}
