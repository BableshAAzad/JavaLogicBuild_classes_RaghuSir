package Practice3.day1;

public class Q6ReplaceCharWithBlank {
    public static void main(String[] args) {
        String word = "java is a programming language";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != ' ') {
                sb.append("");
            }else{
                sb.append(" ");
            }
        }
        System.out.println(word.length() + " : " + word);
        System.out.println(sb.length());
    }
}
