package ru.stqa.pft.addressbook;

public class ContactData {
    private final String firstname;
    private final String lastname;
    private final String homePhoneNumber;
    private final String email;

    public ContactData(String firstname, String lastname, String homePhoneNumber, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.homePhoneNumber = homePhoneNumber;
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }

    public String getEmail() {
        return email;
    }
}
