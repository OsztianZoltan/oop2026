package oop.labor6_parcialis;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Informatika info = new Informatika();
        Diak d1 = new Diak("Mezei","Maria",9.16,9.20);
        Diak d2 = new Diak("Asztalos","Imre",8.19,9.50);
        info.ujBeiratkozo(d1);
        //info.ujBeiratkozo(d2);
        //info.listazOsszes();
        ArrayList<Diak> students = readStudents("students.txt");
        for(Diak d:students){
            info.ujBeiratkozo(d);
        }
        //info.listazOsszes();
        System.out.println(students.size());
        for(Diak d : students){
            System.out.println(d.atlag());
        }
    }
    private static ArrayList<Diak> readStudents(String filename) {
        ArrayList<Diak> students = new ArrayList<>();
        try {
            Scanner file = new Scanner(new File(filename));
            while(file.hasNextLine()){
                String line = file.nextLine();
                //System.out.println(line);
                String[] array = line.split(" ");
                String vnev = array[0].trim();
                String knev = array[1].trim();
                double erettsegi =Double.parseDouble(array[2].trim());
                double matematika =Double.parseDouble(array[3].trim());
                Diak d = new Diak(vnev,knev,erettsegi,matematika);
                students.add(d);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return students;
    }
}