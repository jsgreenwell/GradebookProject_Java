package edu.oop.data.classparts;
/**
 * Place class represents a location like a College, School, or University itself.
 */

public class Place {
    private String name;
    private String address;
    protected String building;
    protected String room;

    public Place(String building, String room) {
        this.building = building;
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}