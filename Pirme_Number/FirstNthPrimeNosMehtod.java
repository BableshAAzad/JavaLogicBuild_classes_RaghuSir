package Pirme_Number;
import java.util.Scanner;

class FirstNthPrimeNosMehtod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer value : ");
        int n = sc.nextInt();
        for (int i = 1; i<=n; i++) {
            boolean rs = isWPrime(i);
            if (rs) {
                System.out.print(i + " ");
                // n--;
            }
        }
    }

    static boolean isWPrime(int x) {
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }
}
