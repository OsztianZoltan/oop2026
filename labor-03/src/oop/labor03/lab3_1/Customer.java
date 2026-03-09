package oop.labor03.lab3_1;

public class Customer {
    //BankAccount account;
    private String firstName;
    private String lastName;
    private BankAccount account;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public BankAccount getAccount() {
        return account;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

    @Override
    public String toString() {
        String result = firstName + " " + lastName;
        if(account==null) result = result + " No Account";
            else result = result + " " + account;
        return result;
    }

    public void closeAccount() {
        this.account = null;
    }
}
