package oop.labor06.labor6_1;

import java.util.ArrayList;

public class Main {
    static void main() {

//        for (int i = 0; i < 1000; i++) {
//             BankAccount account = new BankAccount();
//            System.out.println(account);
//        }
//        for (int i = 0; i < 10; i++) {
//            Customer customer = new Customer("Palma","Adam");
//            System.out.println(customer);
//        }
//        ArrayList<Customer> customers = new ArrayList<>();
//        Customer c1 = new Customer("Pityiri","Palko");
//        customers.add(c1);
//        customers.add(new Customer("Pan","Peter"));
//        customers.add(new Customer("Sapka","Janos"));
//        for(Customer customer:customers){
//            customer.addAccount(new BankAccount());
//            System.out.println(customer);
//        }
        System.out.println("\n*************\n");
        Bank bank=new Bank("OTP");
        bank.addCustomer(new Customer("Zoltan","Osztian"));
        bank.addCustomer(new Customer("Bela","Osztian"));
        for (int i = 1; i <= bank.numCustomers(); i++) {
            bank.getCustomer(i).addAccount(new BankAccount());
            bank.getCustomer(i).addAccount(new BankAccount());
        }
        System.out.println(bank.getCustomer(1));
        for (int i = 1; i <=bank.numCustomers(); i++) {
            ArrayList <String> numbers = bank.getCustomer(i).getAccountNumbers();
            for(String s : numbers){
                bank.getCustomer(i).getAccount(s).deposit(456*i);
            }
        }
        System.out.println(bank.getCustomer(2));
        bank.printCustomersToFile( "bank_customers.csv");
    }
}
