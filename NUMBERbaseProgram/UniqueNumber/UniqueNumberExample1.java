package NUMBERbaseProgram.UniqueNumber;

import java.util.Scanner;
// 70, 123, 175, 3259 it is unique number
// 22, 1100, 1010 it is not a unique number
public class UniqueNumberExample1 {
    public static void main(String args[]) {
        int r1, r2, number, n1, n2, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check: ");
        number = sc.nextInt();
        n1 = number;
        n2 = number;
        while (n1 > 0) {
            r1 = n1 % 10;
            while (n2 > 0) {
                r2 = n2 % 10;
                if (r1 == r2) {
                    count++;
                }
                n2 = n2 / 10;
            }
            n1 = n1 / 10;
        }
        if (count == 1) {
            System.out.println("The number is unique.");
        } else {
            System.out.println("The number is not unique.");
        }
    }
}
