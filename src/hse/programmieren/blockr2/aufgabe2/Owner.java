package hse.programmieren.blockr2.aufgabe2;

public class Owner {

    private String firstName;
    private String lastName;

    public Owner(final String firstName, final String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
