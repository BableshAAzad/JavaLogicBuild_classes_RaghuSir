package Pattern.Damaru;

public class DamaruSidha {
    public static void main(String[] args) {
        int n = 7, space = n - 2, star = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= star; j++)
                System.out.print("* ");
            for (int j = 1; j <= space; j++)
                System.out.print("  ");
            for (int j = 1; j <= star; j++)
                System.out.print("* ");
            if (i <= n / 2) {
                star++;
                space = space - 2;
            } else {
                star--;
                space = space + 2;
            }
            System.out.println();
        }
    }
}
