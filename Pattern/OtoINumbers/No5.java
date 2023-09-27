package Pattern.OtoINumbers;

public class No5 {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i <= n; i++) {
            if (i <= n / 2)
                System.out.print("* ");
            if (i == 1 || i == (n / 2) + 1 || i == n) {
                for (int j = 1; j <= n - 1; j++)
                    System.out.print("* ");
            } else if (i > n / 2) {
                for (int j = 1; j <= n - 1; j++) {
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // Output : 
// * * * * * * * 
// *
// *
// * * * * * *
//             *
//             *
// * * * * * *
}
