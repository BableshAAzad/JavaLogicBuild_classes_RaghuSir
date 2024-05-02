package Practice.Demo;

import java.sql.Time;

// Waj print how many seconds between two times
public class SecondsBetweenTwoTime {
    public static void main(String[] args) {
        int h = 1, m = 30, s = 10;
        Time time = new Time(h, m, s);
        time.getTime();
    }
}
