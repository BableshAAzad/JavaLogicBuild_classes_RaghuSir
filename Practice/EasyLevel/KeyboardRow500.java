package Practice.EasyLevel;

import java.util.*;

public class KeyboardRow500 {
    public static String[] findWords(String[] words) {
        ArrayList<String> al = new ArrayList<>();
        String[] res = new String[words.length];
        int x = 0, y = 0, d = 0;
        al.add("qwertyuiop");
        al.add("asdfghjkl");
        al.add("zxcvbnm");
        for (int i = 0; i < words.length; i++) {
            char[] ch = words[i].toLowerCase().toCharArray();
            for (String str : al) {
                int count = 0;
                for (int j = 0; j < ch.length; j++) {
                    if (str.contains(ch[j] + "")) {
                        count++;
                    } else
                        break;
                }
                if (count == ch.length) {
                    res[x++] = words[i];
                    y++;
                    count = 0;
                }
            }
        }
        String[] result = new String[y];
        for (String string : res) {
            if (string != null)
                result[d++] = string;
        }
        return result;
    }

    public static void main(String[] args) {
        // String[] words = { "Hello", "Alaska", "Dad", "Peace" }; // ["Alaska","Dad"]
        // String[] words = { "omk"}; // []
        String[] words = { "adsdf", "sfd" }; // ["adsdf","sfd"]
        String[] res = findWords(words);
        System.out.println(Arrays.toString(res));
    }
}
/**
 * Given an array of strings words, return the words that can be typed using
 * letters of the alphabet on only one row of American keyboard like the image
 * below.
 * 
 * In the American keyboard:
 * 
 * the first row consists of the characters "qwertyuiop",
 * the second row consists of the characters "asdfghjkl", and
 * the third row consists of the characters "zxcvbnm".
 * 
 * Example 1:
 * 
 * Input: words = ["Hello","Alaska","Dad","Peace"]
 * Output: ["Alaska","Dad"]
 * Example 2:
 * 
 * Input: words = ["omk"]
 * Output: []
 * Example 3:
 * 
 * Input: words = ["adsdf","sfd"]
 * Output: ["adsdf","sfd"]
 */