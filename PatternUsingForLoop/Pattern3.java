package PatternUsingForLoop;

public class Pattern3 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++)
                System.out.print("  ");
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
                if (j != i)
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
