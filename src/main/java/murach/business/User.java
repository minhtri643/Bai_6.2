package murach.business;

import java.io.Serializable;

public class User implements Serializable{
    private String email;
    private String firstName;
    private String lastName;
    private String heardFrom;
    private String updates;
    private String contactVia;
    
    public User() {
        firstName = "";
        lastName = "";
        email = "";
        heardFrom = "";
        updates = "";
        contactVia = "";
    }

    // Constructors, getters, and setters...
    public User(String email, String firstName, String lastName,
                String heardFrom, String updates, String contactVia) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.heardFrom = heardFrom;
        this.updates = updates;
        this.contactVia = contactVia;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getheardFrom() {
        return heardFrom;
    }

    public void setheardFrom(String heardFrom) {
        this.heardFrom = heardFrom;
    }

    public String getupdates() {
        return updates;
    }

    public void setupdates(String updates) {
        this.updates = updates;
    }

    public String getcontactVia() {
        return contactVia;
    }

    public void setcontactVia(String contactVia) {
        this.contactVia = contactVia;
    }
}

