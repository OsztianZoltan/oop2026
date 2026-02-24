package oop.labor02;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("BT1");
        System.out.println(account1.getAccountNumber()+ " : "+ account1.getBalance());
        account1.deposit(1000);
        System.out.println(account1.withdraw(100));
    }
}
