package oop.labor04.lab4_2;

import oop.labor04.lab4_1.Person;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main() {
        ArrayList<Customer> customers = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File("lab4_2_input.csv"))) {

            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();

                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");
                if(line.startsWith("Customer")){
                    //System.out.println("This is a Customer");


                    //String type = items[0].trim();
                    String firstName = items[1].trim();
                    String lastName = items[2].trim();
                    //System.out.println(items);
                    customers.add(new Customer(firstName, lastName));
                    //System.out.println(customers.get(0));
                }
                else{
                   // String type = items[0].trim();

                    String account = items[1].trim();
                    double balance = Double.parseDouble(items[2].trim());
                    System.out.println("This is a BankAccount");
                   // BankAccount bankaccount = new BankAccount(account);
                    //bankaccount.deposit(balance);
                    customers.getLast().addAccount(new BankAccount(account));
                    customers.getLast().getAccount(account).deposit(balance);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for(Customer customer:customers){
            System.out.println(customer);
        }
    }
}
