package oop.labor02;

public class DateUtil {

    public static boolean leapYear(int year){
        if (year % 400 == 0) return true;
        if (year % 100 == 0) return false;
        return year % 4 == 0;
    }

    public static boolean isValidDate(int year, int month, int day){

        if (year <= 0) return false;
        if (month < 1 || month > 12) return false;
        if (day < 1) return false;

        int maxDays = 31;

        // 30 napos hónapok
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            maxDays = 30;
        }

        // Február
        if (month == 2) {
            if (leapYear(year)) {
                maxDays = 29;
            } else {
                maxDays = 28;
            }
        }

        return day <= maxDays;
    }
}