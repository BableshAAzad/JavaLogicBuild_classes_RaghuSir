package Pattern.AtoZLatters;

public class S {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i <= n; i++) {
            if (i <= n / 2 && i != 1)
                System.out.print("* ");
            if (i == 1 || i == (n / 2) + 1 || i == n) {
                System.out.print(" ");
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
    // outpu :
    //  * * * * * * 
    // *
    // *
    //  * * * * * *
    //             *
    //             *
    //  * * * * * *

//  -----------Or---------------------

    // int n = 5, temp = n / 2;
    //     for (int i = 1; i <= n; i++) {
    //         for (int j = 1; j <= n; j++) {
    //             if (i == 1 || i == n || i == temp + 1) {
    //                 System.out.print("*" + " ");
    //             }
    //         }
    //         if (i < temp + 1 && i != 1)
    //             System.out.print("*");
    //         if (i > temp + 1 && temp < n && i != n) {
    //             for (int j = 1; j <= n - 1; j++) {
    //                 System.out.print("  ");
    //             }
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }

     // outpu :
    // * * * * * * 
    // *
    // *
    // * * * * * *
    //           *
    //           *
    // * * * * * *
}
