package Happy_number;
import java.util.Scanner;

class HappyNoOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer value : ");
        int n = sc.nextInt();
        boolean rj = isHappy(n);
        if (rj)
            System.out.println(n + " is a Happy number");
        else
            System.out.println(n + " is not a happy number");
    }

    static boolean isHappy(int n) {
        while (n > 9) {
            int sum = 0;
            do {
                int d = n % 10;
                sum = sum + d * d;
                n = n / 10;
            } while (n > 0);
            n = sum;
        }
        return n == 1 || n == 7;
    }
}
