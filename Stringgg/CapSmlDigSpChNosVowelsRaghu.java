package Stringgg;

import java.util.Scanner;

public class CapSmlDigSpChNosVowelsRaghu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        int uc = 0, lc = 0, vc = 0, cc = 0, sp = 0, dc = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                uc++;
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                    vc++;
                else
                    cc++;
            } else if (ch >= 'a' && ch <= 'z') {
                lc++;
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    vc++;
                else
                    cc++;
            } else if (ch >= '0' && ch <= '9')
                dc++;
            else
                sp++;

        }
        System.out.println("Total Uppercase is : " + uc);
        System.out.println("Total Lowercase is : " + lc);
        System.out.println("Total vowels present is : " + vc);
        System.out.println("Total sonsonents present is : " + cc);
        System.out.println("Total digits present is : " + dc);
        System.out.println("Total special charactor present is : " + sp);
    }
}
