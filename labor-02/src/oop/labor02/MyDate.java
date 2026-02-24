package oop.labor02;

public class MyDate {
    private int year;
    private int month;
    private int day;
    public  MyDate(int y,int m, int d){
        if(y>0)
            year = y;
        if(m>0 && m<13)
            month = m;
        if(d>0 && d<32)
            day=d;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
}
