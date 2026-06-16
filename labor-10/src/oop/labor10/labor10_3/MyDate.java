package oop.labor10.labor10_3;

public class MyDate implements Comparable<MyDate>{

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return this.year + "-" + this.month + "-" + this.day;
    }

    @Override
    public int compareTo(MyDate o) {
        if (this.year!=o.year) return this.year-o.year;
        if (this.month!=o.month) return this.month-o.month;
        if (this.day!=o.day) return this.day-o.day;
        return 0;
    }
}
