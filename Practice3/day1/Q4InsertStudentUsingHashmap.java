package Practice3.day1;

import java.util.HashMap;
import java.util.Map;

class Student {
    String studentName;
    int studentAge;
    String stundetAddress;

    Student(String studentName, int studentAge, String stundetAddress) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.stundetAddress = stundetAddress;
    }

    @Override
    public String toString() {
        return "Name : " + studentName + ", Age : " + studentAge + ", Address : " + stundetAddress;
    }
}

public class Q4InsertStudentUsingHashmap {
    public static void main(String[] args) {
        Student s1 = new Student("Bablesh", 90, "Bengalore");
        Student s2 = new Student("Kumar", 80, "Goa");
        Student s3 = new Student("AAzad", 70, "Jaipur");
        Map<Integer, Student> map = new HashMap<>();
        map.put(1, s1);
        map.put(2, s2);
        map.put(3, s3);
        System.out.println(map);
    }

}
