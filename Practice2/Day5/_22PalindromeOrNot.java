package Practice2.Day5;

import java.util.Scanner;

public class _22PalindromeOrNot {
    // ^ ex: 12321
    // ^ if given number is palindrome return 2 else return
    static int isPalinNum(int input1) {
        // Read only region end
        // Write code here
        int temp = input1;
        int rev = 0;
        while (input1 > 0) {
            rev = rev * 10 + input1 % 10;
            input1 /= 10;
        }
        if (rev != temp)
            return 1;
        return 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter a integer number : ");
        int n = sc.nextInt();
        int i = isPalinNum(n);
        System.out.println(i == 1 ? "Not Palindrome" : "Palindrome");
        sc.close();
    }

}
