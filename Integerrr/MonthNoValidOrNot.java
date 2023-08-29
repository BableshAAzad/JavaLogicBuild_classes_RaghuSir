package Integerrr;
import java.util.Scanner;

class MonthNoValidOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer number :");
        int m = sc.nextInt();
        if (m >= 0 && m <= 12)
            System.out.println(m + " is a valid month number");
        else
            System.out.println(m + " is invalid month number");
    }
}
