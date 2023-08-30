package Test_V_NumberSystem;

import java.util.Scanner;

public class DecToHexaQ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        String hexa = dectohexa(n);
        System.out.println("Dec value : " + n + " of Hexadecimal is : " + hexa);
        sc.close();
    }

    static String dectohexa(int n) {
        String hex = "";
        do {
            int d = n % 16;
            if (d < 10)
                hex = d + hex;
            else
                hex = hex + (char) (d + 55);
            n = n / 16;
        } while (n > 0);
        return hex;
    }
}
