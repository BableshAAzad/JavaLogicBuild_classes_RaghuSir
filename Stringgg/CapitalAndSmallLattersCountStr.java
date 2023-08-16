package Stringgg;

import java.util.Scanner;

public class CapitalAndSmallLattersCountStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        int uc = 0, lc = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                uc++;
            else if (ch >= 97 && ch <= 122)
                lc++;
        }
        System.out.println("Number of capital latteres : " + uc);
        System.out.println("Number of small latters : " + lc);
    }
}
