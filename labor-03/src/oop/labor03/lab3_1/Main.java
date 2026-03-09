package oop.labor03.lab3_1;

public class Main {
    public static void main(String args[]) {
//        BankAccount account1 = new BankAccount("BT1");
//        BankAccount account2 = new BankAccount("BT2", 10000);
//        System.out.println("account1: "+ account1);
//        System.out.println("account2: "+ account2);
        Customer customer1 = new Customer("Zoltan","Osztian");
        System.out.println(customer1);
        customer1.setAccount(new BankAccount("BT1",1000));
        System.out.println(customer1);
        customer1.getAccount().deposit(2000);
        System.out.println(customer1);
        Customer customer2 = new Customer("Mary","WHITE");
        customer2.setAccount(new BankAccount("BT2"));
        System.out.println(customer2);
        customer2.getAccount().deposit(1000);
        System.out.println(customer2);
        customer2.closeAccount();
        System.out.println(customer2);
        customer2.setAccount(customer1.getAccount());

        System.out.println(customer1);
        System.out.println(customer2);



    }
}
