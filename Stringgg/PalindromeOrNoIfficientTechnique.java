package Stringgg;

import java.util.Scanner;

public class PalindromeOrNoIfficientTechnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        PalindromeOrNoIfficientTechnique pn = new PalindromeOrNoIfficientTechnique();
        boolean bl = pn.isPalindrome(str);
        if (bl)
            System.out.println(str + " is a palindrome");
        else
            System.out.println(str + " is not a palindrome");
    }

    String rv = "";

    boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
