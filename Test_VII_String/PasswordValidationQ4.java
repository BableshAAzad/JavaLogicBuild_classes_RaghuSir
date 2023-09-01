package Test_VII_String;

import java.util.Scanner;

public class PasswordValidationQ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Password : ");
        String password = sc.nextLine();
        if (password.length() > 8) {
            int a = 0, b = 0;
            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);
                if (ch >= 'A' && ch <= 'Z')
                    a++;
                else if (ch >= '0' && ch <= '9')
                    b++;
            }
            if (a != 0 && b != 0)
                System.out.println("Password is validated");
            else
                System.out.println("Invalid password");
        } else {
            System.out.println("Password must be greater than 8 charactor");
        }
        sc.close();
    }
}
