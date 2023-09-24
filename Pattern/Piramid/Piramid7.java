package Pattern.Piramid;

public class Piramid7 {
    public static void main(String[] args) {
        int n = 9;
        for (int i = 1; i <= (n / 2) + 1; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print("  ");
            for (int j = i; j >= 1; j--)
                System.out.print(j + " ");
            for (int j =2; j<=i; j++)
                System.out.print(j + " ");
            System.out.println();
        }
    }
}
