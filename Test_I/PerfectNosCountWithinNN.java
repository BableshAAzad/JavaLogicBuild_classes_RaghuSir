package Test_I;

import java.util.Scanner;

public class PerfectNosCountWithinNN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the interger value :");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            boolean bl = perf(i);
            if (bl)
                count++;
        }
        System.out.println("Within " + n + " perfect numebers present in : " + count);
    }

    static boolean perf(int n) {
       int sum = 0, intitNo = n;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0)
                sum = sum + i;
        }
        return sum==intitNo;
    }
}
