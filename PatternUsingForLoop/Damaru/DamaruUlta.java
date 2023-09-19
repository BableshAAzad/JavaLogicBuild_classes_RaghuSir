package PatternUsingForLoop.Damaru;

public class DamaruUlta {
    public static void main(String[] args) {
        int n = 7, space = 0, star = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++)
                System.out.print("  ");
            for (int j = 1; j <= star; j++)
                System.out.print("* ");
            if (i <= n / 2) {
                space++;
                star = star - 2;
            } else {
                space--;
                star = star + 2;
            }
            System.out.println();
        }
    }
}
