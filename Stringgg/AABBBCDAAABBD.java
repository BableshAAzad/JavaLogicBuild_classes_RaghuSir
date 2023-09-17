package Stringgg;

import java.util.Scanner;

public class AABBBCDAAABBD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter a String :");
        String str = sc.nextLine();
        sc.close();
        char[] ch = str.toCharArray();
        int count = 1;
        String rev = "";
        for (int i = 1; i < ch.length; i++) {
            if (ch[i - 1] != ch[i]) {
                rev = rev + ch[i - 1];
                rev = rev + count;
                count = 1;
            } else
                count++;
        }
        rev = rev + ch[ch.length - 1];
        rev = rev + count;
        System.out.println(rev);
    }
}
