package Pirme_Number;

import java.util.Scanner;

public class PrimeNoOrNotMethod2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the enteger number : ");
        int n = sc.nextInt();
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.println(n + " : is not a prime number");
                return;
            }
        }
        System.out.println(n + " is a prime number");
    }
}
