package Practice3.day1;

public class Q1CountWordsAndCheckPalindrome {
    public static void main(String[] args) {
        String sentance = "My name is bablesh ana babbab hello";
        String res = checkPelindrome(sentance);
        int numWords = contWords(sentance);
        System.out.println("Number of Words : " + numWords);
        System.out.println("Palindrome words : " + res);
    }

    static String checkPelindrome(String sentance) {
        String[] temp = sentance.split(" ");
        String pali = "";
        for (int i = 0; i < temp.length; i++) {
            boolean bl = pelindrome(temp[i]);
            if (bl) {
                pali += temp[i] + " ";
            }
        }
        return pali;
    }

    static boolean pelindrome(String word) {
        StringBuilder sb = new StringBuilder(word);
        sb.reverse();
        return sb.toString().equals(word);
    }

    static int contWords(String sentance) {
        String[] temp = sentance.split(" ");
        return temp.length;
    }
}
