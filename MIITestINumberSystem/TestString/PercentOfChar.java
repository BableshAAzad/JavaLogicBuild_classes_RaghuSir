package MIITestINumberSystem.TestString;

public class PercentOfChar {
    public static void main(String[] args) {
        String str = "BBBBNXXA";
        countPerc(str);
    }

    private static void countPerc(String str) {
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                count[ch - 65]++;
        }
        double total = str.length();
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0)
                System.out.println((char) (i + 65) + " : " + (count[i] * 100 / total) + " %");
        }
    }
    /**
     * Output : 
     * A : 12.5 %
     * B : 50.0 %
     * N : 12.5 %
     * X : 25.0 %
     */
}
