package oop.labor03.lab3_2;


import oop.labor03.lab3_1.BankAccount;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        String[] accountNumbers={"BT1","BT2","BT3","BT4","BT5","BT10","BT11","BT12"};
        Customer customer1 = new Customer("Zoltan","Osztian");
        Customer customer2 = new Customer("Norbert","Csipan");
        for(int i=0;i<5;i++){
            customer1.addAccount(new BankAccount(accountNumbers[i],1000));
        }
        for (int i = 5; i <accountNumbers.length; i++) {
            customer2.addAccount(new BankAccount(accountNumbers[i],1000));
        }
//        customer1.addAccount(new BankAccount(accountNumbers[0],1000));
//        customer1.addAccount(new BankAccount(accountNumbers[1],20000));
//        customer1.addAccount(new BankAccount(accountNumbers[2],4000));
//
//        Customer customer2 = new Customer("Norbert","Csipan");
//        customer2.addAccount(new BankAccount(accountNumbers[3],1000));
//        customer2.addAccount(new BankAccount(accountNumbers[4],20000));

        Random rand = new Random();

        // customer1 számlák
        for(int i = 0; i < customer1.getNumAccounts(); i++) {
            int amount = rand.nextInt(1000);
            customer1.getAccount(accountNumbers[i]).deposit(amount);
        }

        // customer2 számlák
        for(int i = 0; i < customer2.getNumAccounts(); i++) {
            int amount = rand.nextInt(2000);
            customer2.getAccount(accountNumbers[i + customer1.getNumAccounts()]).deposit(amount);
        }

        System.out.println(customer1);
        System.out.println(customer2);

        customer1.closeAccount("BT1");
        customer2.closeAccount("BT12");

        System.out.println(customer1);
        System.out.println(customer2);
    }
}
