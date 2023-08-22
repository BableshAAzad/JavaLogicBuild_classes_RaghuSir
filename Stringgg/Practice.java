package Stringgg;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            str = str.toLowerCase();
            char ch = str.charAt(i);
                count[ch-97]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0)
                System.out.println((char)(i+65) + "-->" + count[i]);
        }
    }
}
