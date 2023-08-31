package Test_V_NumberSystem;

import java.util.Scanner;

public class SquareRootQ5 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		double d = sroot(n);
		System.out.println(n + " of square root is : " + d);
		sc.close();
	}

	static double sroot(int n) {
		double t = 0;
		double sq = n / 2;
		do {
			t = sq;
			sq = (t + (n / t)) / 2;
		} while ((t - sq) != 0);
		return sq;
	}


	
    // static void exchange() {
    //     int n = 17;
    //     for (int i = 2; i <n/2; i++) {
    //         if(n/i==i)
    //         System.out.println(i);
    //     }

    // }
}
