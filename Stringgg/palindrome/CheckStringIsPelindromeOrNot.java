package Stringgg.palindrome;

public class CheckStringIsPelindromeOrNot {
    public static void main(String[] args) {
        boolean bl = checkPalindrome("aazad");
        System.out.println(bl);
        System.out.println("aazaa".length() / 2);
    }

    public static boolean checkPalindrome(String str) {
        int j = str.length() - 1;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) == str.charAt(j--))
                continue;
            else
                return false;
        }
        return true;
    }
}
