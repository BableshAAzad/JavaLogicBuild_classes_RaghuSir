package Pirme_Number;
import java.util.Scanner;

class PrimeNoOrNorUsingMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer value : ");
        int n = sc.nextInt();
        boolean rf = isPrime(n);
        if (rf == true)
            System.out.println(n + " is prime number");
        else
            System.out.println(n + " is not a prime number");
    }

    static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
