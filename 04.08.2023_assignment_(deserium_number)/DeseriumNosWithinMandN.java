import java.util.Scanner;

class DeseriumNosWithinMandN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer value: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        for (int i = m; i <= n; i++) {
            boolean rf = isDeserium100(i);
            if (rf) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isDeserium100(int m) {
        int sum = 0,intialM=m;
        int dc = digitCount(m);
        do {
            int d = m % 10;
            sum = sum + power(d, dc);
            dc--;
            m = m / 10;
        } while (m != 0);
        return sum == intialM;
    }

    static int digitCount(int m) {
        int count = 0;
        do {
            count++;
            m = m / 10;
        } while (m != 0);
        return count;
    }

    static int power(int d, int dc) {
        int pow = 1;
        while (dc > 0) {
            pow = pow * d;
            dc--;
        }
        return pow;
    }
}
