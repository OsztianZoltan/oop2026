package oop.labor12.labor12_1;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private int id;
    private String firstname;
    private String lastname;
    private Map<String,Double> grades = new HashMap<>();
    private double avrage=0;

    public Student(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public double getAvrage() {
        return avrage;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
    public void addGrade(String tantargy, double grade){
        grades.put(tantargy, grade);
    }
    public void computeAvrage(){
        double sum = 0;
        for(double grade : grades.values()){
            if(grade < 5){
                avrage = 0;
                return;
            }
            sum += grade;
        }
        avrage = sum / grades.size();
        if(avrage < 6){
            avrage = 0;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' + "Tantargyak= " + grades.values() +
                ", avrage=" + avrage +
                '}';
    }
}
