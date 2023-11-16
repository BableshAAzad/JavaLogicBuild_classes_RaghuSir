package Practice2.Day10;

import java.util.HashSet;
import java.util.Set;

public class ReplaceWord2 {
    public static String replaceWords(String[] dictionary, String sentence) {
        Set<String> set = new HashSet();
        for (String root : dictionary)
            set.add(root);
        StringBuilder ans = new StringBuilder();
        String word[] = sentence.split(" ");
        for (int j = 0; j < word.length; j++) {
            String temp = "";
            for (int i = 1; i <= word[j].length(); ++i) {
                temp = word[j].substring(0, i);
                if (set.contains(temp))
                    break;
            }
            if (ans.length() > 0)
                ans.append(" ");
            ans.append(temp);
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        // String[] str = { "cat", "bat", "rat" };
        // String s = "the cattle was rattled bt the battery";
        // ^ the cat was rat by the bat
        String[] str = { "a", "b", "c" };
        String s = "aadsfast absbs bbab cadsfafs";
        // ^ a a b c
        String result = replaceWords(str, s);
        System.out.println(result);
    }
}
