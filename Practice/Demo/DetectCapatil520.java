package Practice.Demo;

public class DetectCapatil520 {
    public static boolean detectCapitalUse(String word) {
        if (word.length() == 1)
        return true;
        String ab = word;
        ab = ab.toLowerCase();
        if (ab.equals(word))
        return true;
        String cd = word;
        cd = cd.toUpperCase();
        if (cd.equals(word))
        return true;
        int count = 0;
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(0) >= 'A' && word.charAt(0) <= 'Z')
                if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z')
                    count++;
        }
        if (count == word.length() - 1)
            return true;
        return false;
    }

    public static void main(String[] args) {
        String str = "djshfjdjR"; // ^ false
        // String str = "FlaG"; // ^ false
        boolean bl = detectCapitalUse(str);
        System.out.println(bl);
    }
}
