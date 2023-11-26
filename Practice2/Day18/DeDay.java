package Practice2.Day18;

import java.util.Stack;

class InnerDeDay {
    InnerDeDay(int a) {

    }

    InnerDeDay() {
        System.out.println("hell");
    }

}

public class DeDay extends InnerDeDay {
    DeDay() {
     
    }

    public static void main(String[] args) {
       DeDay d = new DeDay();
    }
}
