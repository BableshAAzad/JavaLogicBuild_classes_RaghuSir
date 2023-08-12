package Test_II;
import java.util.Scanner;

public class PrimeNumberCheckAndPWNth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the interger value :");
        int n = sc.nextInt();
        boolean bl = isPrime(n);
        if (bl) {
            System.out.println(n + " is a prime number");
        } else
            System.out.println(n + " is not a prime number");

        for (int i = 0; i <= 100; i++) {
            boolean bls = isPrimeWithin100(i);
            if (bls)
                System.out.print(i + " ");
        }
    }

    static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static boolean isPrimeWithin100(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }
        if (count == 2)
            return true;
        else
            return false;
    }
}
