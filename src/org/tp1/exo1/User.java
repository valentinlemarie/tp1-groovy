package org.tp1.exo1;

/**
 * Created by raclet on 14/03/2015.
 */
public class User {
    private String firstName;
    private String lastName;
    private String username;
    private Address address;

    public User(String firstName, String lastName, String username, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public Address getAddress() {
        return address;
    }
}
