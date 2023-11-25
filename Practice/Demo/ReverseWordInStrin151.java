package Practice.Demo;

public class ReverseWordInStrin151 {
    public static String reverseWords(String s) {
        s = s.replaceAll("\\s+"," ").trim();
        String[] str = s.split(" ");
        String res = "", space = " ";
        for (int i = 0; i < str.length; i++) {
            if (i == 0)
                res = str[i];
            else
                res = str[i] + space + res;
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "the sky is blue";
        String str = reverseWords(s);
        System.out.println(str);
    }
}
/**
 * Input: s = "the sky is blue"
 * Output: "blue is sky the"
 */