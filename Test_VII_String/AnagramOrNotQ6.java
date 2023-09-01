package Test_VII_String;

import java.util.Scanner;

public class AnagramOrNotQ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String : ");
        String ms = sc.nextLine();
        System.out.println("Enter second String : ");
        String ss = sc.nextLine();
        sc.close();
        boolean bl = anagramCheck(ms, ss);
        if (bl)
            System.out.println("String is a Anagram");
        else
            System.out.println("String is not a Anagram");
    }

    static boolean anagramCheck(String ms, String ss) {
        int[] c1 = countWord(ms);
        int[] c2 = countWord(ss);
        for (int i = 0; i < c1.length; i++) {
            if (c1[i] != c2[i])
                return false;
        }
        return true;
    }

    static int[] countWord(String str) {
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                count[ch - 65]++;
            else if (ch >= 'a' && ch <= 'z')
                count[ch - 97]++;
        }
        return count;
    }
}
