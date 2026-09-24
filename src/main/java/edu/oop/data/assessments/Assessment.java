package edu.oop.data.assessments;

import java.time.LocalDate;
import java.util.UUID;

/**
 * Assessment class represents an assessment.
 * This is incomplete as we have to consider what type of assessment it is.
 * Also ... what? You tell me what else we need.
 */
public class Assessment {
    public UUID id = UUID.randomUUID();
    public String name;
    private int totalPoints = 100; // Default total points for assessments
    private int scoredPoints;
    private LocalDate examDate = LocalDate.now(); // Default to current date
    public string courseName;

    /**
     * Create new instance of Assessment with a set name and score.
     * @param name The name of the Assessment
     * @param score The user's score on the Assessment
     */
    public Assessment(String name, int score) {
        // UUID is set automatically so don't need to override it
        this.name = name;
        scoredPoints = score;
    }

    /**
     * Create new instance of Assessment with a set name and score.
     * @param name The name of the Assessment
     * @param score The user's score on the Assessment
     * @param total The total points possible for the Assessment
     */
    public Assessment(String name, int score, int total) {
        // UUID is set automatically so don't need to override it
        this.name = name;
        scoredPoints = score;
        totalPoints = total;
    }

    /**
     * Add a new student score
     * @param score The point based score to be added
     */
    public void enterScore(int score) {
        if (score >= 0) {
            scoredPoints = score;
        }
    }

    /**
     * Get the Score of the Assessment as a percentage of total points
     * @return The score (percentage: scored points / total score possible)
     */
    public double getScore() {
        return scoredPoints*1.0 /totalPoints;
    }

    // Default getter & setters for date
    public LocalDate getExamDate() {
        return examDate;
    }

    public void setExamDate(LocalDate examDate) {
        this.examDate = examDate;
    }
}
