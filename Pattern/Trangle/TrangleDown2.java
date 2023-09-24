package Pattern.Trangle;

public class TrangleDown2 {
    public static void main(String[] args) {
        int n = 5, b = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= b; j++)
                System.out.print("  ");
            for (int j = 1; j <= n-b; j++) {
                System.out.print(j + " ");
            }
            b++;
            System.out.println();
        }
    }
}
