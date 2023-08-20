package Stringgg;

import java.util.Scanner;

public class CountWordsInSentance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentance : ");
        String str = sc.nextLine();
        int count = countWords(str);
        System.out.println("Total " + count + " Words present");
    }

    static int countWords(String str) {
        int count = 0;
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i - 1] == ' ')
                count++;
        }
        return count;
    }
}
