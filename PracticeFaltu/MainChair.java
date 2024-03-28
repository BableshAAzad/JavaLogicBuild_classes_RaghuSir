package PracticeFaltu;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;

class Chair {
    private int chairId;
    private String chairName;
    private LocalDate chairDOB;

    Chair(int chairId, String chairName, LocalDate chairDOB) {
        this.chairId = chairId;
        this.chairName = chairName;
        this.chairDOB = chairDOB;
    }

    public LocalDate getDOB() {
        return chairDOB;
    }
}

public class MainChair {
    public static void main(String[] args) {
        Chair c1 = new Chair(101, "Nilkamal", LocalDate.of(1995, 06, 28));
        Chair c2 = new Chair(102, "Soniya", LocalDate.of(1998, 12, 25));

        Map<String, Chair> map = new HashMap<>();
        map.put("first Chair", c1);
        map.put("second Chair", c2);
        Chair c11 = map.get("first Chair");
        Chair c22 = map.get("second Chair");
        Period p = Period.between(c11.getDOB(), c22.getDOB());
        System.out.println(p.getYears() + " years, " + p.getMonths() + " months, " + p.getDays()+" days");
    }

}
