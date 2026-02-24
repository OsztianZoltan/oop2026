package oop.labor02;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("BT1");
        System.out.println(account1.getAccountNumber()+ " : "+ account1.getBalance());
        account1.deposit(1000);
        System.out.println(account1.getAccountNumber()+ " : "+account1.getBalance());
        account1.withdraw(500);
        System.out.println(account1.getAccountNumber()+ " : "+account1.getBalance());
       if( account1.withdraw(1000)) {
           System.out.println(account1.getAccountNumber() + " : " + account1.getBalance());
       }
       else System.out.println("Sikertelen levetel");
        BankAccount account2 = new BankAccount("OTP00002");
        System.out.println(account2.getAccountNumber()+ " : "+account2.getBalance());
        account2.deposit(2000);
        System.out.println(account2.getAccountNumber()+ " : "+account2.getBalance());


    }
}
