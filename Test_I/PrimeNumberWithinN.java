package Test_I;

import java.util.Scanner;

public class PrimeNumberWithinN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the interger value :");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            boolean bl = isPrime(i);
            if (bl) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }
        return (count == 2);
    }
}
