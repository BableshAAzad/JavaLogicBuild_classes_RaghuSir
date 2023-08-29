package Integerrr;
import java.util.Scanner;

class MonthDaysShows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer number :");
        int m = sc.nextInt();
        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
            System.out.println("31 days");
        else if (m == 4 || m == 6 || m == 11)
            System.out.println("30 days");
        else if (m == 2)
            System.out.println("28 or 29 days");
        else
            System.out.println("Please enter 1 to 12 number only");
    }
}
