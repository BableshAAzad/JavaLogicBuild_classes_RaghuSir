import java.util.*;

class DiseriumNosWithinN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The integer : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            boolean rs = isDeserium(i);
            if (rs)
                System.out.print(i + " ");
        }
    }

    static boolean isDeserium(int n) {
        int dc = digitCount(n);
        double sum = 0;
        int temp = n;
        do {
            int d = n % 10;
            sum = sum + Math.pow(d, dc);
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

    // static int power(int d, int dc) {
    // int prod = 1;
    // while (dc > 0) {
    // prod = prod * d;
    // dc--;
    // }
    // return prod;
    // }
}
