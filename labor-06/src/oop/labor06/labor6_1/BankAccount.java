package oop.labor06.labor6_1;

public class BankAccount {
    public final static String PREFIX="OTP";
    public final static int ACCOUNT_NUMBER_LENGTH=10;
    private static int numAccounts=0;
    private final String accountNumber;
    private double balance;
    public BankAccount() {
        ++numAccounts;
        this.accountNumber = createAccountNumber();
    }
    private String createAccountNumber(){
        String result=PREFIX;
        int nr = ACCOUNT_NUMBER_LENGTH-PREFIX.length()-String.valueOf(numAccounts).length();
        for (int i = 0; i < nr; i++) {
            result = result +"0";
        }
        return result+numAccounts;
    }

    public String getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        balance +=amount;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }

    public boolean withdraw(double amount){
        if(amount > balance) return false;
        balance -=amount;
        return true;
    }
}
