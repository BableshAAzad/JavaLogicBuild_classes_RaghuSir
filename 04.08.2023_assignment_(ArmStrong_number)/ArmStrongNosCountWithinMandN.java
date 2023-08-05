import java.util.Scanner;

class ArmStrongNosCountWithinMandN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the enteger number : ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int count = 0;
        for (int i = m; i <= n; i++) {
            boolean rs = isArmStrongs(i);
            if (rs == true) {
                count++;
            }
        }
        System.out.print(count + " Armstrong numbers present in the within " + m + " and " + n);
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
