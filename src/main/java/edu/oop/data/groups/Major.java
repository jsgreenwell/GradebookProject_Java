package edu.oop.data.groups;

import java.util.List;

/**
 * Major class represents a field of study or specialization within an educational institution.
 * It can be used to categorize students and faculty based on their academic focus.
 */
public class Major {
    // No getters & setters - should either access through a Group or be in this package
    protected String name;
    protected String description;
    protected long averageSalary; // starting salary
    protected List<String> careerPaths; // list of common career paths for this major
    protected boolean minor; // true if there is a minor for this major, false if not
    protected String department; // Department to which the major belongs (e.g., Computer Science, MIS, etc.)

    protected List<String> contacts; // list of emails for contacts for this major
}
