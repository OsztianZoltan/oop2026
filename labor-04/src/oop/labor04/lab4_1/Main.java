package oop.labor04.lab4_1;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    static void main() {
//        try (Scanner scanner = new Scanner(new File("lab4_1_input.txt"))) {
//
//            int lineCounter = 0;
//
//            while (scanner.hasNextLine()) {
//                String line = scanner.nextLine();
//                System.out.println(++lineCounter + " " + line);
//            }
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
        ArrayList<Person> persons = readFromCSVFile("lab4_1_input.csv");
//        for (int i = 0; i < persons.size(); i++) {
//            System.out.println(persons.get(i));
//        }
        for (Person p : persons) {
            System.out.println(p);
        }
    }

    public static ArrayList<Person> readFromCSVFile(String fileName) {

        ArrayList<Person> persons = new ArrayList<>();

        try (Scanner file = new Scanner(new File(fileName))){
            while(file.hasNextLine()){
                String line = file.nextLine();
                String[] array = line.split(",");
                String firstName=array[0].trim();
                String lastName=array[1].trim();
                int birthYear= Integer.parseInt(array[2].trim());
                Person p = new Person(firstName,lastName,birthYear);
                persons.add(p);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return persons;
    }
}