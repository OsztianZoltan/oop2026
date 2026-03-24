package oop.labor05;

import oop.labor05.model.Course;
import oop.labor05.model.MyDate;
import oop.labor05.model.Student;
import oop.labor05.model.Training;

import java.io.File;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main() {
        Random random = new Random();
        ArrayList<Course> courses = readCourses("courses.csv");
        for (Course course : courses) {
            System.out.println(course);
        }
        ArrayList<Student> students = readStudents("students.csv");
        for (Student student : students) {
            System.out.println(student);
        }
        ArrayList<Training>  trainings = new ArrayList<>();
        for (Course course: courses) {
            double price = random.nextDouble(1000,2000);
            Training training = new Training(course,new MyDate(2023,3,21), new MyDate(2023,3,25),price);
            int i = 0;
            while (i<10){
                int index = random.nextInt(0,students.size());
               if(training.enroll(students.get(index))){
                   i++;
               }
            }
            trainings.add(training);

        }
        for(Training training : trainings){
            System.out.println(training);
            training.printToFile();
        }


    }
    private static ArrayList<Course> readCourses(String filename)  {
        ArrayList<Course> courses = new ArrayList<>();
        try {
            Scanner file = new Scanner(new File(filename));
            while(file.hasNextLine()){
                String line = file.nextLine();
               // System.out.println(line );
                String[] array = line.split(",");
                String courseName = array[0].trim();
                String description = array[1].trim();
                int time = Integer.parseInt(array[2].trim());
                Course c = new Course(courseName,description,time);
                courses.add(c);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        return courses;

    }
    private static ArrayList<Student> readStudents(String filename) {
        ArrayList<Student> students = new ArrayList<>();
            try {
                Scanner file = new Scanner(new File(filename));
                while(file.hasNextLine()){
                    String line = file.nextLine();
                    //System.out.println(line);
                    String[] array = line.split(",");
                    String id = array[0].trim();
                    String firstName = array[1].trim();
                    String lastName = array[2].trim();
                    Student s = new Student(id,firstName,lastName);
                    students.add(s);
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        return students;
    }
}
