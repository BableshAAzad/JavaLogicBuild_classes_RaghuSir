package Practice2.Day1;

import java.util.Scanner;

public class AddFirstAndLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer number : ");
        int num = sc.nextInt();
        int result = addFandL(num);
        System.out.println(result);
        sc.close();
    }

    private static int addFandL(int num) {
        String numS = num + "";
        if (numS.length() < 2)
            return num;
        char f = numS.charAt(0);
        char l = numS.charAt(numS.length() - 1);
        return (f - 48) + (l - 48);
    }
}
