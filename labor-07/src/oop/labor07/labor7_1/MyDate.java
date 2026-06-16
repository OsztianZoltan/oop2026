package oop.labor07.labor7_1;

public class MyDate {
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
            return this.year + "_" + this.month + "_" + this.day;
        }
}
