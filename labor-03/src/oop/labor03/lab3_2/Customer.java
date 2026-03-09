package oop.labor03.lab3_2;

import oop.labor03.lab3_1.BankAccount;

public class Customer {
    //BankAccount account;
    private String firstName;
    private String lastName;
    private BankAccount[] accounts = new BankAccount[MAX_ACCOUNTS];
    public static final int MAX_ACCOUNTS = 10;
    private int numAccounts;



    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public BankAccount getAccount(String accountNumber) {
        for(int i=0;i<numAccounts;i++){
            if(accounts[i].getAccountNumber().equals(accountNumber)){
                return accounts[i];
            }
        }
        return null;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void addAccount(BankAccount account) {
        if(numAccounts < MAX_ACCOUNTS){
            accounts[numAccounts] = account;
            numAccounts ++;
        }
    }


    public int getNumAccounts() {
        return numAccounts;
    }

    @Override
    public String toString() {
//       String result = this.firstName + " " + this.lastName + " Accounts: \n";
//       for(int i=0 ; i < numAccounts ; i++){
//           result +="\t" + accounts[i] + "\n";
//       }
//       return result;
        StringBuffer result = new StringBuffer();
        result.append(firstName).append(' ').append(lastName).append(" accounts:\n");
        for(int i=0; i<numAccounts; ++i){
            result.append("\t").append(accounts[i]).append("\n");
        }
        return result.toString();
    }

    public void closeAccount(String accountNumber) {
        for(int i=0;i<numAccounts;i++){
            if(accounts[i].getAccountNumber().equals(accountNumber)){
                for(int j=i;j<numAccounts-1;j++){
                    accounts[j]=accounts[j+1];

                }
                numAccounts--;
                accounts[numAccounts]=null;
            }
        }
    }

}
