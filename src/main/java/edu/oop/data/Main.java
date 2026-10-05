package edu.oop.data;


public class Main {
    enum STATE {
        START, SCHEDULE, ASSESS, GRADES, EXIT
    } // Add states as needed

    static int displayStudentMenu() {
        IO.println("\n".repeat(10));
        IO.print("""
                        Welcome to Course Management System.
                        Please select from the following options:
                          1. View Schedule
                          2. View Assessment Grades in Course
                          3. View Course Grades
                        []: \s
                        """);
        int choice = Integer.parseInt(IO.readln());
        if  (choice >= 1 && choice <= 3) {
            // This is really stupid but we'll add options
            return choice;
        }
        IO.println("Invalid selection. Try again.");
        return 0;
    }

    static boolean checkExit() {
        IO.print("Would you like to continue (y/n): ");
        return !IO.readln().toLowerCase().startsWith("y");
    }

    static void main() {
        // We'll integrate this into a GUI later (using Android probably)

        STATE state = STATE.START;
        while (state != STATE.EXIT) {
            switch (displayStudentMenu()) {
                case 1:
                    state = STATE.SCHEDULE;
                    IO.println("Set schedule here");
                    break;
                case 2:
                    state = STATE.ASSESS;
                    IO.println("Set assessment grades here");
                    break;
                case 3:
                    state = STATE.GRADES;
                    IO.println("Set course grades here");
                    break;
            }

            if (checkExit()) {
                state = STATE.EXIT;
            } else {
                state = STATE.START;
            }
        }




    }
}
