package Stringgg;

import java.util.Scanner;

public class CapSmlDigSpChNosVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        int spCount = 0, dcount = 0, vcount = 0, uc = 0, lc = 0, consonent = 0;
        for (int index = 0; index < str.length(); index++) {
            char ch = str.charAt(index);
            if ((ch >= 32 && ch <= 47) || (ch >= 58 && ch <= 64) || (ch >= 91 && ch <= 96))
                spCount++;
            else if (ch >= 48 && ch <= 57)
                dcount++;
            else if (ch >= 'A' && ch <= 'Z')
                uc++;
            else if (ch >= 97 && ch <= 122)
                lc++;

            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e'
                    || ch == 'i'
                    || ch == 'o' || ch == 'u')
                vcount++;
            else
                consonent++;
        }
        System.out.println("Special charactor present in :" + spCount);
        System.out.println("Digits present here :" + dcount);
        System.out.println("Number of vowels is : " + vcount);
        System.out.println("Number of capital latteres : " + uc);
        System.out.println("Number of small latters : " + lc);
        System.out.println("Number of consonents present is :" + consonent);
    }
}
