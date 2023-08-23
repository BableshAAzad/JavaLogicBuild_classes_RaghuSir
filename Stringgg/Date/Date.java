package Stringgg.Date;

import java.util.Scanner;

public class Date {
    int dd, mm, yy;
    int[] month = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    String[] dname = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

    public Date(int dd, int mm, int yy) {
        this.dd = dd;
        this.mm = mm;
        this.yy = yy;
        if (yy % 4 == 0 && yy % 100 != 0 && yy % 400 == 0)
            month[2] = 29;
    }

    int noOfDays() {
        int y = yy - 1;
        int days = y * 365 + y / 4 - y / 100 + y / 400;
        for (int i = 1; i < mm; i++) {
            days = days + month[i];
        }
        days = days + dd;
        return days;
    }

    String dayName() {
        int days = noOfDays();
        return dname[days % 7];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first date (dd mm yyyy) : ");
        int d1 = sc.nextInt();
        int m1 = sc.nextInt();
        int y1 = sc.nextInt();
        Date dt1 = new Date(d1, m1, y1);
        System.out.println("Enter the second date (dd mm yyyy) : ");
        int d2 = sc.nextInt();
        int m2 = sc.nextInt();
        int y2 = sc.nextInt();
        Date dt2 = new Date(d2, m2, y2);
        int x = dt1.noOfDays();
        int y = dt2.noOfDays();
        System.out.println("Number of Days between these two days : " + (y - x));
        System.out.println("Days Name of the first date : " + dt1.dayName());
        System.out.println("Day name of the second date : " + dt2.dayName());
    }
}
