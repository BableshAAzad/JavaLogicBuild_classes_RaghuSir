import java.util.Scanner;

public class CheckDeseriumNoAndPrintWthinAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the interger value :");
        int n = sc.nextInt();
        boolean rs = isDiserium(n);
        if (rs)
            System.out.println(n + " is a deserium number");
        else
            System.out.println(n + " is not a deserium number");
    }
    static boolean isDiserium(int n ){
        
        return true;
    }
}
