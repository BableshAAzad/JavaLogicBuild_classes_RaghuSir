package PatternUsingForLoop.Cube;

// import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter integer value : ");
        // int n = sc.nextInt();
        // sc.close();
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------");
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------");
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(j%2+" ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------");
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------");
        int x=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(x%2+" ");
                x++;
            }
            System.out.println();
        }
        System.out.println("-------------------------------");
        for(int i=1; i<=n; i++){
            for(int j=5; j>=1; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------");
        int y =1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(y+" ");
                y++;
                if(y==10)
                 y=1;
            }
            System.out.println();
        }
    }
}
