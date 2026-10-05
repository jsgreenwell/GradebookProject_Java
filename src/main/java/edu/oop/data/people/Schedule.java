package edu.oop.data.people;

import edu.oop.data.classparts.RunningClass;

import java.util.ArrayList;
import java.util.List;

/**
 * Schedule class represents a schedule for a person (faculty, student, or administrator).
 * It can be used to manage and organize events, appointments, and tasks.
 */
public class Schedule {
    List<RunningClass> runningClasses = new ArrayList<>();

    public Schedule() {
        for (int i=0; i<4; i++) {
            RunningClass temp = new RunningClass(12834+i,"SCO", "31" + Integer.toString(i));
            runningClasses.add(temp);
        }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (RunningClass cls : runningClasses){
            sb.append("CRN: ").append(cls.CRN).append(" ; ");
            if (cls.faculty != null){
                sb.append("Instructor: ").append(cls.faculty).append(" ; ");
            } else {
                sb.append("Instructor: Staff").append(" ; ");
            }
            sb.append("Location: ").append(cls.place.getBuilding()).append(", ")
                    .append(cls.place.getRoom()).append("\n");
        }
        return sb.toString();
    }
}
