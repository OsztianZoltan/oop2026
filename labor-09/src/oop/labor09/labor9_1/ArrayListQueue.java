package oop.labor09.labor9_1;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListQueue implements IQueue{
    private ArrayList<Object> items ;
    public final int CAPACITY;

    public ArrayListQueue(int capacity){
        CAPACITY=capacity;
        items = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public boolean isFull() {
        return items.size()==CAPACITY;
    }

    @Override
    public void enQueue(Object object) {
        if(!isFull()){
            items.add(object);
        }
        else {
            System.out.println("Tele van a sor");
            return;
        }
    }

    @Override
    public Object deQueue() {
        if(isEmpty()){
            System.out.println("A sor ures");
            return null;
        }

        return items.remove(0);
    }

    @Override
    public void printQueue() {
        System.out.println(items);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ArrayListQueue that = (ArrayListQueue) o;
        return  Objects.equals(items, that.items);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(items, CAPACITY);
//    }
}
