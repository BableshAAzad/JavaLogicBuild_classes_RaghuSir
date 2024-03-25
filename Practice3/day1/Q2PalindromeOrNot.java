package Practice3.day1;

import java.util.Scanner;

public class Q2PalindromeOrNot {
    public static void main(String[] args) {
        System.out.println("Enter word or number and check palindrome or not : ");
        Scanner sc = new Scanner(System.in);
        String inp = sc.next();
        boolean bl = palindromeCheck(inp);
        if (bl)
            System.out.println("It is a palindrome");
        else
            System.out.println("Not a palindrome");
    }

    private static boolean palindromeCheck(String temp) {
        StringBuilder sb = new StringBuilder(temp);
        sb.reverse();
        return temp.equals(sb.toString());
    }
}
