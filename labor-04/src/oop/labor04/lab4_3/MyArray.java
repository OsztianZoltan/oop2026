package oop.labor04.lab4_3;

import oop.labor04.lab4_1.Person;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MyArray {
    private int length;
    private double[] elements;

    public MyArray(int length) {
        this.length = length;
        this.elements=new double[this.length];
    }

    public MyArray(double[] elements) {
        this(elements.length);
        for (int i = 0; i < elements.length; i++) {
            this.elements[i]=elements[i];
        }
//        this.elements=new double[elements.length];
//        this.length=elements.length;
    }

    public MyArray(MyArray array){
        this(array.elements);
    }
    public MyArray(String fileName){
        try (Scanner file = new Scanner(new File(fileName))){
            this.length=file.nextInt();
            this.elements = new double[this.length];
            for (int i = 0; i < this.length; i++) {
                elements[i]=file.nextDouble();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public void fillRandom(double x, double y){
        for (int i = 0; i <elements.length; i++) {
            elements[i]=x+Math.random()*y;
        }
    }
    public double mean(){
        if(length==0) return Double.NaN;
        double sum = 0;
        for (int i = 0; i < elements.length; i++) {
            sum+=elements[i];

        }
        return sum/length;
    }
    public double stddev(){
        return mean();
        //befejezni
    }
    public void sort(){
        Arrays.sort(elements);
    }
    public void print(String name){
        System.out.print(name+ " ");
        for (int i = 0; i <length; i++) {
            System.out.print(elements[i]+" ");

        }
        System.out.println();
    }
}
