package Stringgg;

import java.util.Scanner;

public class MostOccuredCharInStringWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        int big = 0;
        String bword = "";
        for (int i = 0; i < ch.length; i++) {
            int[] count = new int[26];
            String w = "";
            while (i < ch.length && ch[i] != ' ') {
                if (ch[i] >= 'A' && ch[i] <= 'Z')
                    count[ch[i] - 65]++;
                else if (ch[i] >= 'a' && ch[i] <= 'z')
                    count[ch[i] - 95]++;
                w = w + ch[i];
                i++;
            }
            for (int j = 0; j < 26; j++) {
                if (count[j] > big) {
                    big = count[j];
                    bword = w;
                }
            }
        }
        System.out.println(bword);
        sc.close();
    }
}
