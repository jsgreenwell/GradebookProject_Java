package edu.oop.data.people;

import java.time.LocalDate;
import java.util.Random;

/**
 * Person class represents a person with basic information such as
 * name, date of birth, email, phone, and address.
 */
public class Person {
    protected long id;
    private String fname;
    private String lname;
    protected String preferName = "";
    private LocalDate birthDate;
    private String email;
    private String phone;
    private String address;

    /**
     * Create new instance of UserStructures.People with a set first & last name
     * @param fname The legal fist name of the Person
     * @param lname The legal last name of the Person
     */
    public Person(String fname, String lname) {
        id = new Random().nextLong();
        this.fname = fname;
        this.lname = lname;
    }

    /**
     * Create new instance of UserStructures.People with a set first & last name
     * @param fname The legal fist name of the Person
     * @param lname The legal last name of the Person
     * @param preferName The preferred name of the Person
     */
    public Person(String fname, String lname, String preferName) {
        this(fname, lname);
        this.preferName = preferName;
    }

    /**
     * Create new instance of UserStructures.People with a set first & last name
     * @param fname The legal fist name of the Person
     * @param lname The legal last name of the Person
     * @param dob The date of birth of the Person
     */
    public Person(String fname, String lname, LocalDate dob) {
        this(fname, lname);
        birthDate = dob;
    }

    /**
     * Wraps getName - legacy method for getting the preferred name of the person.
     * @return Preferred Name if set, Full Name if not
     */
    public String getPreferName() {
        return getName();
    }

    /**
     * Returns the preferred name of the person.
     * @return Preferred name if exists or legal first & last name
     */
    public String getName() {
        if (preferName.isEmpty()) {
            return fname + " " + lname;
        }
        return preferName;
    }

    /**
     * Sets the preferred name of the person.
     * @param newName The new preferred name
     */
    public void setPreferName(String newName) {
        if (!newName.isEmpty()) {
            preferName = newName;
        }
    }

    // These are just default getters and setters.
    // TODO: Add validation to setters for email, phone, and address & overloads.
    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
