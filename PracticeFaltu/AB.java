package PracticeFaltu;

public class AB {
    public static void main(String[] args) {
        int a = 10;
        AB x = new AB(a);
    }

    void m1() {
        System.out.println("m1");
    }

    AB() {
    }

    AB(int v) {
        AB a = new AB();
        a.m1();
    }
}
