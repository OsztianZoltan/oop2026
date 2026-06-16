package oop.labor10.labor10_1;

public class Main {
    static void main(String[] args) {
        SortingDemo Fruit = new SortingDemo("fruits.txt");
        System.out.println("All fruits: ");
        Fruit.printFruit();
        System.out.println();
        System.out.println("fruits sorted: ");
        Fruit.sortAlphabetically();
        Fruit.printFruit();
        System.out.println();
        System.out.println("fruits reverse sorted: ");
        Fruit.sortReverseAlphabetically();
        Fruit.printFruit();
    }
}
