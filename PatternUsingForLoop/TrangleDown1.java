package PatternUsingForLoop;

public class TrangleDown1 {
    public static void main(String[] args) {
        int n = 5, b = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= b; j++)
                System.out.print("  ");
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            b++;
            System.out.println();
        }
    }
}
