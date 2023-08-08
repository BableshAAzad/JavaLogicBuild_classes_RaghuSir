package Spy_Number;
import java.util.Scanner;

class SpyNoOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer value :");
        int n = sc.nextInt();
        boolean bl = isSpy(n);
        if (bl)
            System.out.println(n + " is a spy number");
        else
            System.out.println(n + " is not spy number");
    }

    static boolean isSpy(int n) {
        int sum = 0, pro = 1;
        do {
            int d = n % 10;
            sum = sum + d;
            pro = pro * d;
            n = n / 10;
        } while (n != 0);
        return (sum == pro);
    }
}
