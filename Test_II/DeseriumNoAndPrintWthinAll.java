package Test_II;

import java.util.Scanner;

public class DeseriumNoAndPrintWthinAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the interger value :");
        int n = sc.nextInt();
        boolean rs = isDiserium(n);
        if (rs)
            System.out.println(n + " is a deserium number");
        else
            System.out.println(n + " is not a deserium number");
        System.out.println("Within " + n + " deserium numbers present in : ");
        for (int i = 0; i < n; i++) {
            boolean rb = isDiseriumCount(i);
            if (rb)
                System.out.print(i + " ");
        }
    }

    static boolean isDiserium(int n) {
        int sum = 0, intN = n;
        int dc = digitCount(n);
        do {
            int d = n % 10;
            sum = sum + pow(d, dc);
            dc--;
            n = n / 10;
        } while (n > 0);
        return (sum == intN);
    }

    static boolean isDiseriumCount(int n) {
        int sum = 0, intiN = n;
        int dc = digitCount(n);
        do {
            int d = n % 10;
            sum = sum + pow(d, dc);
            dc--;
            n = n / 10;
        } while (n > 0);
        return (sum == intiN);
    }

    static int digitCount(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    static int pow(int d, int dc) {
        int p = 1;
        while (dc > 0) {
            p = p * d;
            dc--;
        }
        return p;
    }
}
