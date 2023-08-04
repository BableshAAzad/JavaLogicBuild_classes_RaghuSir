import java.util.Scanner;

class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The integer : ");
        int n = sc.nextInt();
        boolean rs = isArmStrong(n);
        if (rs)
            System.out.println(n + " is a Armstrong number");
        else
            System.out.println(n + " is not a Armstrong number");
    }

    static boolean isArmStrong(int x) {
        int dc = countDigit(x);
        int sum = 0, nValue = x;
        do {
            int d = x % 10;
            sum = sum + power(d, dc);
            x = x / 10;
        } while (x != 0);
        return sum == nValue;
    }

    static int countDigit(int y){
        int count = 0;
        do{
            count++;
            y=y/10;
        }while(y!=0);
        return count;
    }

    static int power(int d, int dc){
        int pro =1;
        while(dc>0){
          pro = pro*d;
          dc--;
        }
        return dc;
    }
}
