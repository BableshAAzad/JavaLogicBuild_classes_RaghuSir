package Pirme_Number;
import java.util.Scanner;

class PrimeNosCountWithinNUseMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer value : ");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 2; i <= n; i++) {
            boolean rs = isnPrime(i);
            if (rs)
                count++;
        }
        System.out.println("Number of prime number within " + n + " is " + count);
    }

    static boolean isnPrime(int x) {
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }
}
