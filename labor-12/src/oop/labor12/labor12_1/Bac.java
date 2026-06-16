package oop.labor12.labor12_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Bac {
    private  Map<Integer,Student> students = new HashMap<>();

    public Bac(String filename) {
        try {
            Scanner scanner = new Scanner(new File(filename));

            while (scanner.hasNext()) {
                int id = scanner.nextInt();
                String lastname = scanner.next();
                String firstname = scanner.next();

                Student student = new Student(id, firstname, lastname);
                students.put(id, student);
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Nem talalhato a fajl: " + filename);
        }
    }
    public void readSubject(String filename) {
        try {
            Scanner scanner = new Scanner(new File(filename));

            String subject = filename.replace(".txt", "");

            while (scanner.hasNext()) {

                int id = scanner.nextInt();

                String gradeText = scanner.next().replace(',', '.');
                double grade = Double.parseDouble(gradeText);

                Student student = students.get(id);

                if (student != null) {
                    student.addGrade(subject, grade);
                }
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Nem talalhato a fajl: " + filename);
        }
    }

    public Map<Integer, Student> getStudents() {
        return students;
    }

    public void computeAvrage() {
        for (Student s : students.values()) {
            s.computeAvrage();
        }
    }
    public void printPassedStudentsCount() {
        int count = 0;
        for (Student s : students.values()) {
            if (s.getAvrage() > 0) {
                count++;
            }
        }
        System.out.println("Atment diakok szama: " + count);
    }
    @Override
    public String toString() {
        return "Bac{" +
                "students=" + students +
                '}';
    }
    public void printFailedStudents() {

        ArrayList<Student> failedStudents = new ArrayList<>();

        for (Student s : students.values()) {
            if (s.getAvrage() == 0) {
                failedStudents.add(s);
            }
        }

        failedStudents.sort(
                Comparator.comparing(Student::getLastname)
                        .thenComparing(Student::getFirstname)
        );

        System.out.println("Bukott diakok:");

        for (Student s : failedStudents) {
            System.out.println(s);
        }
    }
}
