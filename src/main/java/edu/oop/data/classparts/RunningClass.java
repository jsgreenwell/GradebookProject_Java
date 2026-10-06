package edu.oop.data.classparts;

import edu.oop.data.people.Person;

import java.util.HashSet;
import java.util.List;
import java.util.Map;

/**
 * This class is a class - it's the combination of students, instructor, place, and course
 */
public class RunningClass {
    // Holds information about course and location of class
    public long CRN; // Course Reference Number
    private final Course course = new Course();
    public Place place;
    public Person faculty;
    // students contains their ID then a list of grades
    private Map<Long, List<Integer>> students;
    private HashSet<String> absentStudents;

    /**
     * Create a new class for this semester.
     * @param CRN The CRN of the course
     * @param building Build class is at
     * @param room Room number (string as we have letters in room numbers)
     */
    public RunningClass(long CRN, String building, String room) {
        // We would actually load the course information from a DB or JSON file here
        // For now just set it
        this.CRN = CRN;
        this.place = new Place(building, room);
    }

    /**
     * Create a new class for this semester.
     * @param CRN The CRN of the course
     * @param building Build class is at
     * @param room Room number (string as we have letters in room numbers)
     * @param id Person's ID
     * @param role Person's role (faculty, student, staff)
     */
    public RunningClass(long CRN, String building, String room,
                        long id, String role) {
        this(CRN, building, room);
        this.faculty = new Person(id, role);
    }
}
