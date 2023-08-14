package Arrayyy;

import java.util.Scanner;

public class PrintNnameFromtheUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        String[] names = new String[size];
        System.out.println("Enter " + size + " names : ");
        for (int i = 0; i < names.length; i++) {
            names[i] = sc.next();
        }
        System.out.println("Enter the names : ");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}