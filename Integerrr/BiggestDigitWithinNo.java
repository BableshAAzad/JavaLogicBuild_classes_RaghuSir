package Integerrr;
import java.util.Scanner;

class BiggestDigitWithinNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer value : ");
        int n = sc.nextInt();
        int big = -9;
        do {
            int d = n % 10;
            if (d > big)
                big = d;
            n = n / 10;
        } while (n != 0);
        System.out.println("Here biggest digit is :" + big);
    }
}
