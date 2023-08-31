package Stringgg;

import java.util.Scanner;

public class CountCharEachWordsMethod1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        int count=0;
        for(int i = 0; i<ch.length; i++){
            if(i==0 && ch[i] !=' ' || ch[i] != ' ' && ch[i-1]==' '){
                 count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
