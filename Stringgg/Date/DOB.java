package Stringgg.Date;

import java.util.Scanner;

public class DOB {
    int dd, mm, yy;
    int month[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public DOB(int dd, int mm, int yy) {
        this.dd = dd;
        this.mm = mm;
        this.yy = yy;
        if (yy % 4 == 0 && yy % 100 != 0 || yy % 400 == 0)
            month[2] = 29;
    }

    int countnodays() {
        int y = yy - 1;
        int days = 0;
        days = y * 365;
        days = days + (y / 4 - y / 100 + y / 400);
        for (int i = 1; i < mm; i++) {
            days = days + month[i];
        }
        days = days + dd;
        return days;
    }

    static DOB readDOB() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dd mm yyyy");
        int dd = sc.nextInt();
        int mm = sc.nextInt();
        int yy = sc.nextInt();
        DOB d = new DOB(dd, mm, yy);
        return d;
    }

    @Override
    public String toString() {
        return "Date [" + dd + "/" + mm + "/" + yy + "]";
    }

    public static void main(String[] args) {
        System.out.println("enter first date :");
        DOB d1 = DOB.readDOB();
        System.out.println("Enter 2nd date :");
        DOB d2 = DOB.readDOB();
        int days = d2.countnodays() - d1.countnodays();
        System.out.println("no of days between" + d1 + " and " + d2 + " is " + days);
        System.out.println("total year,months till dates " + days / 365 + "" + days % 365 / 30);
        System.out.println("no of years between" + d1 + " and " + d2 + " is " + days / 365);
    }

}
