import java.util.Scanner;

class PerfectNosCountWithinN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the enteger number : ");
        int n = sc.nextInt();
        int count = 0, base = n;
        for (int i = 1; i <= n; i++) {
            boolean rf = isPerfect(i);
            if (rf)
                count++;
        }
        System.out.println(count + " pefects number present within " + base);
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
