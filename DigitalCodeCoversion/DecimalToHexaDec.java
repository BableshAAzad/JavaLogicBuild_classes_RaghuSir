package DigitalCodeCoversion;

import java.util.Scanner;

class DecimalToHexaDec {
    static String decToHexa(int dec) {
        String hx = "";
        do {
            int d = dec % 16;
            if (d < 10)
                hx = d + hx;
            else
                hx = (char) (d + 55) + hx;
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
