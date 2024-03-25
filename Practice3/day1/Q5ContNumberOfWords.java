package Practice3.day1;

public class Q5ContNumberOfWords {
    public static void main(String[] args) {
        String word = "java is a programming language";
        String[] temp = word.split(" ");
        System.out.println(temp.length + " : " + word);
    }
}
