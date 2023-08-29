package Integerrr;
import java.util.Scanner;

class SumOfDivisibleWithinN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the enteger number : ");
        int n = sc.nextInt();
        int sum = n;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0)
                sum = sum + i;
        }
        System.out.println("Sum of divisibles is : " + sum);
    }
}
