package Practice.Demo;

import java.util.Scanner;

class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int t = sc.nextInt();
        if (t >= 1 && t <= 1000) {
            int a, b, sum;
            for (int i = 0; i < t; i++) {
                a = sc.nextInt();
                b = sc.nextInt();
                if (a >= 0 && b <= 1000) {
                    sum = a + b;
                    System.out.println(sum);
                }
            }
        }
    }
}
