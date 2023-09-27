package Pattern.AtoZLatters;

public class H {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i <= n; i++) {
            if (i == (n / 2)+1) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("* ");
                }
            } else {
                System.out.print("* ");
                for (int j = 1; j <= n - 2; j++) {
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // output: 
// *           * 
// *           *
// *           *
// * * * * * * *
// *           *
// *           *
// *           *
}
