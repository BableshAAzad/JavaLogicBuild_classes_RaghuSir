package Deserium_Number;
import java.util.Scanner;

class DeseriumNosCountWithinN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The integer : ");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            boolean rs = isDeserium(i);
            if (rs)
                count++;
        }
        System.out.print(count + " Dieserium numbers present within "+n);
    }

    static boolean isDeserium(int n) {
        int dc = digitCount(n);
        int sum = 0, temp = n;
        do {
            int d = n % 10;
            sum = sum + power(d, dc);
            dc--;
            n = n / 10;
        } while (n != 0);
        return sum == temp;
    }

    static int digitCount(int n) {
        int count = 0;
        do {
            count++;
            n = n / 10;
        } while (n != 0);
        return count;
    }

    static int power(int d, int dc) {
        int prod = 1;
        while (dc > 0) {
            prod = prod * d;
            dc--;
        }
        return prod;
    }
}
