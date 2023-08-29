package Integerrr;
import java.util.Scanner;

class SmallestDigitWithinNi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer value : ");
        int n = sc.nextInt();
        int small = 9;
        do {
            int d = n % 10;
            if (d < small)
                small = d;
            n = n / 10;
        } while (n != 0);
        System.out.println("Here smallest digit is :" + small);
    }
}
