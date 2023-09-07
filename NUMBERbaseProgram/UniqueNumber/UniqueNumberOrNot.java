package NUMBERbaseProgram.UniqueNumber;

import java.util.Scanner;

public class UniqueNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        // boolean bl = isUnique(n);
        // if (bl)
        //     System.out.println(n + " is a Unique number");
        // else
        //     System.out.println(n + " is not a Unique number");
        sc.close();
    }

    // private static boolean isUnique(int n) {
    //     int dc = digitCount(n);
    //     int dcc = dc;
    //     int count = 0;
    //     do {
    //         int d = n % 10;
    //         if (d == dc) {
    //             dc--;
    //             count++;
    //         }
    //         n = n / 10;
    //     } while (n != 0);
    //     return dcc == count;
    // }

    // private static int digitCount(int n) {
    //     int count = 0;
    //     do {
    //         count++;
    //         n = n / 10;
    //     } while (n != 0);
    //     return count;
    // }
}
