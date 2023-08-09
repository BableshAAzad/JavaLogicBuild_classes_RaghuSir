package Perfect_Number;
import java.util.Scanner;

class PerfectNosWithinN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the enteger number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            boolean rf = isPerfect(i);
            if (rf)
            System.out.print(i + " ");
                n--;
        }
    }

    static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == n)
            return true;
        return false;
    }
}
