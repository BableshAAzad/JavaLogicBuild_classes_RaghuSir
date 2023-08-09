package DigitalCodeCoversion;

import java.util.Scanner;

class DecimaltoBinary {
    static String decToBin(int dec) {
        String bin = "";
        do {
            int d = dec % 2;
            bin = d + bin;
            dec = dec / 2;
        } while (dec != 0);
        return bin;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer number : ");
        int n = sc.nextInt();
        String bi = decToBin(n);
        System.out.println(bi);
    }
}
