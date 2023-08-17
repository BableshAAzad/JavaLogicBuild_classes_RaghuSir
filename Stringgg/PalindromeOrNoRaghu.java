package Stringgg;

import java.util.Scanner;

public class PalindromeOrNoRaghu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        PalindromeOrNoRaghu pn = new PalindromeOrNoRaghu();
        boolean bl = pn.isPalindrome(str);
        if (bl)
            System.out.println(str + " is a palindrome");
        else
            System.out.println(str + " is not a palindrome");
    }

    String rv = "";

    boolean isPalindrome(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            rv = rv + str.charAt(i);
        }
        return str.equals(rv);
    }
}
