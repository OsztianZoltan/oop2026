package oop.labor06.labor6_1;

import java.util.ArrayList;

public class Customer {

    private String firstName;
    private String lastName;
    private ArrayList<BankAccount> accounts = new ArrayList<>();
    private final int id;
    private static int numCustomers=1;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id=numCustomers;
        numCustomers++;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public BankAccount getAccount(String accountNumber) {
//        for(int i=0;i<accounts.size();i++){
//            if(accounts.get(i).getAccountNumber().equals(accountNumber)){
//                return accounts.get(i);
//            }
//        }
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;

    }
    public ArrayList<String> getAccountNumbers(){
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < accounts.size(); i++) {
            result.add(accounts.get(i).getAccountNumber());
        }
        return result;
    }
    public void addAccount(BankAccount account) {
        accounts.add(account);
    }


    public int getNumAccounts() {
        return accounts.size();

    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
//       String result = this.firstName + " " + this.lastName + " Accounts: \n";
//       for(int i=0 ; i < numAccounts ; i++){
//           result +="\t" + accounts[i] + "\n";
//       }
//       return result;
        StringBuffer result = new StringBuffer();
        // result.append(accounts.size());
        result.append("iD: ").append(id).append("\n");
        result.append(firstName).append(' ').append(lastName).append(" has ").append(accounts.size()).append(" accounts:\n");
        for(int i=0; i<accounts.size(); ++i){
            result.append("\t").append(accounts.get(i)).append("\n");
        }
        return result.toString();
    }

    public void closeAccount(String accountNumber) {
        for(int i=0;i<accounts.size();i++){
            if(accounts.get(i).getAccountNumber().equals(accountNumber)){
                accounts.remove(i);
                break;
            }
        }
    }
}
