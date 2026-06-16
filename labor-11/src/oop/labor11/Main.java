package oop.labor11;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("PROBLEM 1 : ");
//        System.out.println(readFirstLine("path.txt"));
//        System.out.println(readFirstLine("lab4_1_input.csv"));
//        System.out.println(readFirstLine("alma.txt"));
//        System.out.println();
//        System.out.println("PROBLEM 2 :");
//        int a = 12, b = 6;
//        try {
//            System.out.println(safeDivide(a,b));
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        try {
//            System.out.println(safeDivide(a,0));
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        System.out.println("PROBLEM 3:");
//        demostrateFInally();
       BankAccount acc1 = new BankAccount(500);
        try {
            acc1.withDraw(200);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(acc1.getBalance());

        BankAccount acc2 = new BankAccount(1000);

        try {
            acc2.withDraw(1000);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(acc2.getBalance());

        BankAccount acc3 = new BankAccount(700);
        try {
            acc3.withDraw(800);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(acc3.getBalance());
    }
    public static String readFirstLine(String path){
        try(Scanner sc = new Scanner(new File(path))){
            if(sc.hasNextLine()){
                return sc.nextLine();
            }
            return "Empty file";
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            return "File not found";
        }
    }
    public static int safeDivide(int a, int b) throws Exception {
        if(b==0){
            throw new Exception("DIVISION_BY_ZERO");
        }
        else{
            return a/b;
        }
    }
    public static void demostrateFInally(){
        try{
            System.out.println("Eroforras megnyitasa");
            throw  new RuntimeException("Futasideju hiba");
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Ez mindig lfeut");
        }
    }
}
