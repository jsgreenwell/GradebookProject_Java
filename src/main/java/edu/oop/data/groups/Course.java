package edu.oop.data.groups;

import java.util.List;

/**
 * Course class represents a specific course offered within an educational institution.
 * It can be used to manage course details, including the course name, description, and other relevant information.
 */
public class Course {
    // Again no getters & setters - should either access through a Group member or be in this package
    protected String CRN; // Course Reference Number
    protected String subject; // Course subject (e.g., "CS" for Computer Science)
    protected int courseNumber; // Course number (e.g., 101, 202)

    protected String name; // Course name
    protected String description; // Course description
    protected short credits; // Course credits
    protected String semester; // Semester in which the course is typically offered (e.g., "Fall", "Spring", "All")

    protected List<String> prerequisites; // List of prerequisite courses
    protected List<String> restrictions; // List of restrictions for the course (e.g., "Senior standing only")
    protected String attributes; // Course attributes (e.g., "Natural Science", "Humanities", "Social Science")
}
