package oop.labor04.lab4_2;
import oop.labor04.lab4_2.BankAccount;

import java.util.ArrayList;

public class Customer {
    //BankAccount account;
    private String firstName;
    private String lastName;
    private ArrayList<BankAccount> accounts = new ArrayList<>();



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

    public void addAccount(BankAccount account) {
            accounts.add(account);
        }


    public int getNumAccounts() {
        return accounts.size();

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

