package oop.labor10.labor10_3;

public class Employee {
    private static int counter = 1;

    private final int ID;
    private String firstName;
    private String lastName;
    private double salary;
    private MyDate birthDate;

    public Employee(String firstName, String lastName, double salary, MyDate birthDate) {
        this.ID = counter++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.birthDate = birthDate;
    }

    public int getID() { return ID; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public double getSalary() { return salary; }
    public MyDate getBirthDate() { return birthDate; }

    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setSalary(double salary) { this.salary = salary; }

    @Override
    public String toString() {
        return "Employee{ID=" + ID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", birthDate=" + birthDate +
                '}';
    }
}
