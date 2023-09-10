package Integerrr.DOBcalculate;

import java.util.Scanner;

public class DOBCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter current date (DD-MM-YYYY) : ");
        int c_d = sc.nextInt();
        int c_m = sc.nextInt();
        int c_y = sc.nextInt();
        System.out.println("Enter date of birthe (DD-MM-YYYY) : ");
        int b_d = sc.nextInt();
        int b_m = sc.nextInt();
        int b_y = sc.nextInt();
        findAge(c_d, c_m, c_y, b_d, b_m, b_y);
    }

    static void findAge(int c_d, int c_m, int c_y, int b_d, int b_m, int b_y) {
        int[] month = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (b_d > c_d) {
            c_m = c_m - 1;
            c_d = c_d + month[b_m - 1];
        }
        if (b_m > c_m) {
            c_y = c_y - 1;
            c_m = c_m + 12;
        }
        int cal_d = c_d - b_d;
        int cal_m = c_m - b_m;
        int cal_y = c_y - b_y;
        System.out.println("Present age is : ");
        System.out.println("Years: " + cal_y + ", Months : " + cal_m + ", Days :" + cal_d);
    }
}
