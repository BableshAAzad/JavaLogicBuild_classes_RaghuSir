package Integerrr;
import java.util.Scanner;

class AverageOfDigitsInTheNth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer value : ");
        int n = sc.nextInt();
        int count = 0;
        int sum = 0;
        do {
            count++;
            int d = n % 10;
            sum = sum + d;
            n = n / 10;
        } while (n != 0);
        System.out.println("Here all digits average is :" + sum / count);
    }
}
