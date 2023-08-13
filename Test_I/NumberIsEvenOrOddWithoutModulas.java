package Test_I;

import java.util.Scanner;

public class NumberIsEvenOrOddWithoutModulas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the interger value :");
        int n = sc.nextInt();
        if(n/2*2==n)
          System.out.println(n+" is a even number");
        else
          System.out.println(n+" is a odd number");
    }
}
