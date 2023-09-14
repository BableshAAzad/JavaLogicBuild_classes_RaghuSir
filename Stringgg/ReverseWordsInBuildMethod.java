package Stringgg;

import java.util.Scanner;

public class ReverseWordsInBuildMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String st = sc.nextLine();
        sc.close();
        String[] str = st.split("\\s");
        String revWord = "";
        for (int i = 0; i < str.length; i++) {
            String revString = "";
            for (int j = 0; j < str[i].length(); j++) {
                char ch = str[i].charAt(j);
                revString = ch + revString;
            }
            revWord = revWord + revString + " ";
        }
        System.out.println(revWord);
    }
}
