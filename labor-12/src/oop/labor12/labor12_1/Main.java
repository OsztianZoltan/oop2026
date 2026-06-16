package oop.labor12.labor12_1;

public class Main {
    static void main(String[] args) {
//        Student student1 = new Student(1, "Anna", "Nagy");
//        student1.addGrade("Matematika", 6);
//        student1.addGrade("Informatika", 7);
//        student1.addGrade("Angol", 8);
//        student1.computeAvrage();
//
//        Student student2 = new Student(2, "Bence", "Kiss");
//        student2.addGrade("Matematika", 6);
//        student2.addGrade("Informatika", 5);
//        student2.addGrade("Angol", 7);
//        student2.computeAvrage();
//
//        Student student3 = new Student(3, "Csilla", "Toth");
//        student3.addGrade("Matematika", 5);
//        student3.addGrade("Informatika", 5);
//        student3.addGrade("Angol", 6);
//        student3.computeAvrage();
//
//        Student student4 = new Student(4, "Daniel", "Kovacs");
//        student4.addGrade("Matematika", 4);
//        student4.addGrade("Informatika", 9);
//        student4.addGrade("Angol", 10);
//        student4.computeAvrage();
//
//        System.out.println(student1);
//        System.out.println(student2);
//        System.out.println(student3);
//        System.out.println(student4);
        Bac bac = new Bac("nevek1.txt");

        bac.readSubject("matek.txt");
        bac.readSubject("roman.txt");
        bac.readSubject("magyar.txt");

        bac.computeAvrage();

        for (Student student : bac.getStudents().values()) {
            System.out.println(student);
        }
        bac.printPassedStudentsCount();
        bac.printFailedStudents();
    }
}
