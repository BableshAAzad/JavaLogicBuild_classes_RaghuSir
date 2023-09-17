package Stringgg;

import java.util.*;

public class CountCharEachWordsUsingInBuilt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentance : ");
        String str = sc.nextLine();
        int count = countCharEW(str);
        System.out.println(count);
    }

    static int countCharEW(String str) {
        int count = 0;
        // char[] ch = str.toCharArray();
        String[] words = str.split(" ");

        for (String word : words) {
            int characterCount = word.length();
            System.out.println(word + " " + characterCount);
            // }
        }
        return count;
    }
}
