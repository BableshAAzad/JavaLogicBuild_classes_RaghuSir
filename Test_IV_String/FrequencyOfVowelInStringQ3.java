package Test_IV_String;

import java.util.Scanner;

public class FrequencyOfVowelInStringQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                count[ch - 97]++;
            else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                count[ch - 65]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                System.out.println((char) (i + 65) + "-->" + count[i]);
            }
        }
    }
}
