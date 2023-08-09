package DigitalCodeCoversion;

import java.util.Scanner;

public class DecimalToHexaDecimal {
    static String decToHexa(int dec) {
        String hx = "";
        do {
            int d = dec % 16;
            if (d < 10)
                hx = d + hx;
            else if (d == 10)
                hx = 'A' + hx;
            else if (d == 11)
                hx = 'B' + hx;
            else if (d == 12)
                hx = 'C' + hx;
            else if (d == 13)
                hx = 'D' + hx;
            else if (d == 14)
                hx = 'E' + hx;
            else
                hx = 'F' + hx;
            dec = dec / 16;
        } while (dec != 0);
        return hx;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer number : ");
        int n = sc.nextInt();
        String hex = decToHexa(n);
        System.out.println(hex);
    }
}
