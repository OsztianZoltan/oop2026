package oop.labor10.labor10_3;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Company {
    private String name;
    private ArrayList<Employee> employees = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hire(Employee e) {
        employees.add(e);
    }

    public void fire(int id) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getID() == id) {
                employees.remove(i);
                i--;
            }
        }
    }

    public void fireAll() {
        employees.clear();
    }
    public void printAll(PrintStream ps) {
        for (Employee e : employees) {
            ps.println(e);
        }
    }
    public void hireAll(String csvFile) {
        try (Scanner sc = new Scanner(new File(csvFile))) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] parts = line.split(",");

                String first = parts[0].trim();
                String last = parts[1].trim();
                double salary = Double.parseDouble(parts[2].trim());
                int year = Integer.parseInt(parts[3].trim());
                int month = Integer.parseInt(parts[4].trim());
                int day = Integer.parseInt(parts[5].trim());

                MyDate date = new MyDate(year, month, day);

                if (parts.length == 7) {
                    String dept = parts[6].trim();
                    hire(new Manager(first, last, salary, date, dept));
                } else {
                    hire(new Employee(first, last, salary, date));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void printManagers(PrintStream ps) {
        for (Employee e : employees) {
            if (e instanceof Manager) {
                ps.println(e);
            }
        }
    }

    public void sortByComparator(Comparator<Employee> comp) {
        Collections.sort(employees, comp);
    }
}
