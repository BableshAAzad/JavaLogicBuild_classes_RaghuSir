package Practice2.Day4;

public class Question2LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs1 = { "flower", "flow", "flight" }; // Output: "fl"
        String[] strs2 = { "dog", "racecar", "car" }; // Output: ""

        for(int i=0; i<strs1.length; i++){
           String s1 =  commPreFix(strs1[i]);
        }
        
    }

    static String commPreFix(String str){
       char[] ch = str.toCharArray();
       
        return null;
    }
}
