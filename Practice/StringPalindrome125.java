package Practice;

public class StringPalindrome125 {
    public static boolean isPalindrome(String s) {
        char[] ch = s.toCharArray();
        String str = "";
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'a' && ch[i] <= 'z' || ch[i] >= 'A' && ch[i] <= 'Z' || ch[i]>='0' && ch[i]<='9') {
                str = str + ch[i];
            }
        }
        str = str.toLowerCase();
        System.out.println(str);
        int a = 0, b = str.length() - 1;
        while (a < b) {
            if (str.charAt(a) != str.charAt(b))
                return false;
            a++;
            b--;
        }
        return true;
    }

    public static void main(String[] args) {
        // String s = "A man, a plan, a canal: Panama";
        String s = "0P";
        boolean bl = isPalindrome(s);
        if (bl)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
/**
 * Example 1:
 * 
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 * Example 2:
 * 
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 * Example 3:
 * 
 * Input: s = " "
 * Output: true
 * Explanation: s is an empty string "" after removing non-alphanumeric
 * characters.
 * Since an empty string reads the same forward and backward, it is a
 * palindrome.
 */
