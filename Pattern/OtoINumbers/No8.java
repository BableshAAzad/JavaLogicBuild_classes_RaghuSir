package Pattern.OtoINumbers;

public class No8 {
    public static void main(String[] args) {
        int n = 11;
        int star = (n / 2) + 2, space = n / 2, star1 = (n / 2) + 1;
        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == star1 || i == n) {
                for (int j = 1; j <= star; j++)
                    System.out.print("* ");
            } else {
                System.out.print("* ");
                for (int j = 1; j <= space; j++)
                    System.out.print("  ");
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
