package Pattern.AtoZLatters;

public class L {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i <= n; i++) {
            if (i < n)
                System.out.print("* ");
            if (i == n) {
                for (int j = 1; j <= n; j++)
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
    // Output :
// * 
// *
// *
// *
// *
// *
// * * * * * * *
}
