package oop.labor10.labor10_3;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Company comp = new Company("Teszt");
        comp.hireAll("employees.csv");

        System.out.println("Alphabetically:");
        comp.sortByComparator(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Double.compare(o1.getSalary(), o2.getSalary());
            }
        });
        comp.sortByComparator(
                Comparator.comparing(Employee::getLastName)
                        .thenComparing(Employee::getFirstName)
        );
        comp.printAll(System.out);

        System.out.println("\nSalary descending:");
        comp.sortByComparator(
                (e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary())
        );
        comp.printAll(System.out);

        System.out.println("\nManagers first:");
        comp.sortByComparator((e1, e2) -> {
            if (e1 instanceof Manager && !(e2 instanceof Manager)) return -1;
            if (!(e1 instanceof Manager) && e2 instanceof Manager) return 1;

            int cmp = e1.getLastName().compareTo(e2.getLastName());
            if (cmp != 0) return cmp;

            return e1.getFirstName().compareTo(e2.getFirstName());
        });

        comp.printAll(System.out);
    }
}
