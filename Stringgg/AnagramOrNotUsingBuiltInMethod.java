package Stringgg;

import java.util.*;

public class AnagramOrNotUsingBuiltInMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Strings : ");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        boolean rs = isAnagram(s1, s2);
        if (rs)
            System.out.println("String is a Anagram");
        else
            System.out.println("String is not a Anagram");
    }

    static boolean isAnagram(String s1, String s2) {
        s1 = s1.replaceAll(" ", "");
        s2 = s2.replaceAll(" ", "");
        if (s1.length() != s2.length())
            return false;
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        char[] c1 = s1.toCharArray();
        char[] c2 = s1.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1, c2);
    }
}
