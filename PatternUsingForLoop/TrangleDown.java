package PatternUsingForLoop;

public class TrangleDown {
    public static void main(String[] args) {
        int n = 5, b = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print("  ");
            for (int j = b; j >= 1; j--) {
                System.out.print(j + " ");
            }
            b++;
            System.out.println();
        }
    }
}
