package Stringgg;

import java.util.HashMap;
import java.util.Map;

public class A2B3A2C3usingMap {
    public static void main(String[] args) {
        // String str = "Ashish Biradar"; // { =1, b=1, r=2, s=2, d=1, h=2}
        String str = "DDSSEESSGGIIHJIIIIOO"; // {s=4, d=2, g=2, h=1, j=1}
        Map<Character, Integer> ans = countChar(str);
        System.out.println(ans);
        // System.out.println(str.contains("AAA"));
    }
    static Map<Character, Integer> countChar(String str) {
        str = str.toLowerCase();
        Map<Character, Integer> map = new HashMap<>();
        String vowel = "aeiou";
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (!vowel.contains(ch + "")) {
                if (map.containsKey(ch)) {
                    map.put(ch, map.get(ch) + 1);
                } else {
                    map.put(ch, 1);
                }
            }
            
        }
        return map;
    }
}
