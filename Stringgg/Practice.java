package Stringgg;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        int[] count = new int[26];
        // char[] cr = str.toCharArray();
        // System.out.println(cr[2]);
        char ch = str.charAt(2);
        System.out.println(ch);
        // for (int i = 0; i < cr.length; i++) {
        //     // str = str.toLowerCase();
        // }
    }
}
