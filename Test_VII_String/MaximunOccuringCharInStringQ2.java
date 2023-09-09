package Test_VII_String;

import java.util.Scanner;

public class MaximunOccuringCharInStringQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentance : ");
        String str = sc.nextLine();
        int[] count = maxOccureChar(str);
        int big = 0;
        int temp = 0;
        for (int i = 0; i < count.length; i++) {
            if (big < count[i]) {
                big = count[i];
                temp = i;
            }
        }
        System.out.println("Maximum occurance charactor is : " + (char) (temp + 65) + " is " + big + " times occured");
    }

    static int[] maxOccureChar(String str) {
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                count[ch - 65]++;
            else if (ch >= 'a' && ch <= 'z')
                count[ch - 97]++;
        }
        return count;
    }
}
