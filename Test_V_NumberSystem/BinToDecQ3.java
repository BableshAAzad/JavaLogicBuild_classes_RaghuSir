package Test_V_NumberSystem;

import java.util.Scanner;

public class BinToDecQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int d = btoDec(n);
        System.out.println("Binary value : " + n + " of Decimal is : " + d);
        sc.close();
    }

    static int btoDec(int n) {
        int dec = 0, f = 1;
        do {
            int d = n % 10;
            dec = dec + d * f;
            f = f * 2;
            n = n / 10;
        } while (n > 0);
        return dec;
    }
}
