package Lesson5;

import Lesson5.exception.StudentNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            Student student = new Student();
            student.setName("Kolya");

            student.find();
        } catch (StudentNotFoundException ex) {
            System.err.print(ex);
        }

    }
}