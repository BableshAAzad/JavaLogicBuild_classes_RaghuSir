package Pattern.Heart;

// import java.util.Scanner;

public class Heart {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a integer value : ");
        // int n = sc.nextInt();
        int n = 9, space1 = 1, space2 = 3;
        for (int i = 1; i <= n; i++) {
            int a = 1;
            for (int j = 1; j <= space1; j++)
                System.out.print("  ");
            for (int j = 1; j <= a; j++)
                System.out.print("* ");
            for (int j = 1; j <= space2; j++)
                System.out.print("  ");
            for (int j = 1; j <= a; j++)
                System.out.print("* ");
            a = a + 2;
            System.out.println();
        }
    }
}
