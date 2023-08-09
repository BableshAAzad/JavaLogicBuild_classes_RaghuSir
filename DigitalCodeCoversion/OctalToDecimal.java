package DigitalCodeCoversion;

import java.util.Scanner;

class OctalToDecimal {
    static int octToDec(int bin) {
        int dec = 0, p = 1;
        do {
            int d = bin % 10;
            dec = dec + d * p;
            p = p * 8;
            bin = bin / 10;
        } while (bin != 0);
        return dec;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer number : ");
        int n = sc.nextInt();
        int decimal = octToDec(n);
        System.out.println(decimal);
    }
}
