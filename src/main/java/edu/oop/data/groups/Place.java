package edu.oop.data.groups;
/**
 * Place class represents a location like a College, School, or University itself.
 */

public class Place {
    private String name;
    private String address;


    public Place(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
