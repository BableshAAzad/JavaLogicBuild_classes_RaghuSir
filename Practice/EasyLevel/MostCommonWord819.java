package Practice.EasyLevel;

import java.util.*;

public class MostCommonWord819 {
    public static String mostCommonWord(String paragraph, String[] banned) {
        StringBuilder sb = new StringBuilder();
        char[] ch = paragraph.toLowerCase().toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ',' && i < ch.length - 1 && ch[i + 1] != ' ')
                sb.append(' ');
            else if ((ch[i] >= 'a' && ch[i] <= 'z') || ch[i] == ' ') {
                sb.append(ch[i]);
            }
        }
        String[] temp = sb.toString().split(" ");
        // ^ System.out.println(Arrays.toString(temp));
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < temp.length; i++) {
            sb1.append(temp[i] + " ");
        }
        // ^ System.out.println(Arrays.toString(temp));
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < temp.length; i++) {
            if (hm.containsKey(temp[i]) == false) {
                hm.put(temp[i], 1);
            } else {
                int x = hm.get(temp[i]);
                hm.put(temp[i], ++x);
            }
        }
        for (int i = 0; i < banned.length; i++) {
            if (hm.containsKey(banned[i]) == true)
                hm.remove(banned[i]);
        }
        // ^ System.out.println(hm);
        Set<String> tt = hm.keySet();
        int m = 0;
        for (String s : tt) {
            int t = hm.get(s);
            m = (t > m) ? t : m;
        }
        // ^ System.out.println(hm);
        // ^ System.out.println(m);
        for (String s : tt) {
            if (m == hm.get(s))
                return s;
        }
        return "";
    }

    public static void main(String[] args) {
        // String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        // String[] banned = { "hit" };
        String paragraph = "a, a, a, a, b,b,b,c, c";
        String[] banned = { "a" };
        String res = mostCommonWord(paragraph, banned);
        System.out.println(res);
    }
}
/**
 * Given a string paragraph and a string array of the banned words banned,
 * return the most frequent word that is not banned. It is guaranteed there is
 * at least one word that is not banned, and that the answer is unique.
 * 
 * The words in paragraph are case-insensitive and the answer should be returned
 * in lowercase.
 * 
 * Example 1:
 * 
 * Input: paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.",
 * banned = ["hit"]
 * Output: "ball"
 * Explanation:
 * "hit" occurs 3 times, but it is a banned word.
 * "ball" occurs twice (and no other word does), so it is the most frequent
 * non-banned word in the paragraph.
 * Note that words in the paragraph are not case sensitive,
 * that punctuation is ignored (even if adjacent to words, such as "ball,"),
 * and that "hit" isn't the answer even though it occurs more because it is
 * banned.
 * Example 2:
 * 
 * Input: paragraph = "a.", banned = []
 * Output: "a"
 */