package Perfect_Number;
import java.util.Scanner;

class PerfectOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the enteger number : ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0)
                sum = sum + i;
        }
        if (sum == n) {
            System.out.println(n + " is pefect number");
        } else
            System.out.println(n + " is not a pefect number");
    }
}
