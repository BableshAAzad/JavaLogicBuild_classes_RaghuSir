package Fibonacci_Number;

class FibonacciNosWithin20 {
    static void printPebo(int n){
        int f1=0, f2=1;
        while(f1<=n){
            System.out.print(f1+" ");
            int f3=f1+f2;
            f1=f2;
            f2=f3;
        }  
    }
    public static void main(String[] args) {
        printPebo(20);
    }
}
