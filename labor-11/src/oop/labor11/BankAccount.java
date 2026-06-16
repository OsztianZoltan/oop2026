package oop.labor11;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public void withDraw(double amount) throws InsufficientFundsException {
        if(amount > balance) {
            throw new InsufficientFundsException("Nincs eleg penzed");
        }
        balance = balance - amount;
    }
}
