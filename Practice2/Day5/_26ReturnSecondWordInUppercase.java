package Practice2.Day5;

import java.util.Scanner;

public class _26ReturnSecondWordInUppercase {
    /*
     * wipro technologies bangalore
     * o/p:TECHNOLOGIES
     * 
     */
    public String secondWordUpperCase(String input1) {
        String s[] = input1.split(" ");
        if (s.length == 1)
            return "LESS";
        String s1 = s[1];
        s1 = s1.toUpperCase();
        return s1;
    }

    public static void main(String[] args) {
        _26ReturnSecondWordInUppercase s = new _26ReturnSecondWordInUppercase();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        String res = s.secondWordUpperCase(str);
        System.out.println(res);
        sc.close();
    }

}
