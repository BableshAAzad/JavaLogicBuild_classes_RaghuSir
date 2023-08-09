package ArmStrong_Number;
import java.util.Scanner;

class ArmStrongNosWithinMandN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the enteger number : ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        for (int i = m; i <= n; i++) {
            boolean rs = isArmStrongs(i);
            if (rs == true) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isArmStrongs(int n) {
        int sum = 0, nValue = n;
        int dc = countDigit(n);
        do {
            int d = n % 10;
            sum = sum + power(d, dc);
            n = n / 10;
        } while (n != 0);
        return sum == nValue;
    }

    static int countDigit(int n) {
        int count = 0;
        do {
            count++;

            n = n / 10;
        } while (n != 0);
        return count;
    }

    static int power(int d, int dc) {
        int pro = 1;
        while (dc > 0) {
            pro = pro * d;
            dc--;
        }
        return pro;
    }
}
