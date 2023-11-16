package Practice2.Day9;

import java.util.Arrays;

public class DetectCapital520 {
    public static boolean detectCapitalUse(String word) {
        char[] ch = word.toCharArray();
        Arrays.sort(ch);
        System.out.println(ch);
        if (ch[0] >= 'A' || ch[0] >= 'a' && ch.length == 1)
            return true;
        else if (ch[0] >= 'A' && ch[ch.length - 1] <= 'Z')
            return true;
        else if (ch[0] >= 'A' && ch[ch.length - 1] >= 'a')
            return false;
        return false;
    }

    public static void main(String[] args) {
        String str = "FlaG";
        boolean bl = detectCapitalUse(str);
        System.out.println(bl);
    }
}
