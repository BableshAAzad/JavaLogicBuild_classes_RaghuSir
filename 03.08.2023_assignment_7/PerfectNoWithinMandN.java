import java.util.Scanner;

class PerfectNoWithinMandN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the enteger number : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean rf = isPerfect(n);
        if (rf == true) {
            System.out.println(n + " is pefect number");
        } else
            System.out.println(n + " is not a pefect number");
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
