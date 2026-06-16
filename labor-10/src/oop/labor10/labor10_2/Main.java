package oop.labor10.labor10_2;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<MyDate> dates = new ArrayList<>();
        dates.add(new MyDate(1,1,2026));
        dates.add(new MyDate(28,4,2026));
        dates.add(new MyDate(1,4,2026));
        dates.add(new MyDate(1,3,2026));
        dates.add(new MyDate(21,3,2026));
        dates.add(new MyDate(28,2,2026));

        //Collections.sort(dates);
        //System.out.println(dates);

        Set<MyDate> dateSet = new TreeSet<>();
        dateSet.add(new MyDate(1,1,2026));
        dateSet.add(new MyDate(28,4,2026));
        dateSet.add(new MyDate(1,4,2026));
        dateSet.add(new MyDate(1,4,2026));
        dateSet.add(new MyDate(1,3,2026));

        for (MyDate date : dateSet) {
            System.out.println(date);
        }

//        Collections.sort(dates, new Comparator<MyDate>() {
//            @Override
//            public int compare(MyDate o1, MyDate o2) {
//                return ;
//            }
//        });
    }
}