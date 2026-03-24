package oop.labor05.model;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Training {
    private Course course;
    private MyDate startDate;
    private MyDate endDate;
    private double pricePerStudent;
    private ArrayList<Student> enrolledStudents = new ArrayList<>();

    public Training(Course course, MyDate startDate, MyDate endDate, double pricePerStudent) {
        this.course = course;
        this.startDate = startDate;
        this.endDate = endDate;
        this.pricePerStudent = pricePerStudent;
    }

    public boolean enroll(Student student) {
        for (Student s : enrolledStudents) {
            if (s.getID().equals(student.getID())) {
                return false;
            }
        }
        enrolledStudents.add(student);
        return true;
    }

    public void printToFile() {
        String filename = String.format("%s_%d.%d.%d_%d.%d.%d.csv",course.getName(),
                startDate.getYear(), startDate.getMonth(), startDate.getDay(),
                endDate.getYear(), endDate.getMonth(), endDate.getDay());

        try (PrintStream out = new PrintStream(filename)) {
            for (Student student : enrolledStudents) {
                out.println(student);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override

    public String toString() {
        StringBuffer result = new StringBuffer("Training{" +
                "course=" + course +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", pricePerStudent=" + pricePerStudent + " enrolled students amount " + enrolledStudents.size()+ "\n");
        for (Student student : enrolledStudents) {

            result.append("\n\t").append(student);

        }
        return result.toString();

    }
}