package oop.labor10.labor10_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortingDemo {
    private ArrayList<String> fruits = new ArrayList<>();
    public SortingDemo(String fileName) {
        try {
            Scanner sc = new Scanner(new File(fileName));
            while (sc.hasNext()) {
                fruits.add(sc.next());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Hiba: a fajl nem talalhato!");
        }
    }
    public void sortAlphabetically(){
        Collections.sort(fruits);
    }
    public void sortReverseAlphabetically() {
        Collections.sort(fruits, Collections.reverseOrder());
    }
    public void printFruit(){
        for(String f : fruits){
            System.out.print(f + " ");
        }
        System.out.println();
    }

}
