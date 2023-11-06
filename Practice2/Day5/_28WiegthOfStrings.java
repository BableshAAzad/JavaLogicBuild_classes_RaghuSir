package Practice2.Day5;

public class _28WiegthOfStrings {
    /*
     * if input2 is 0 we have to neglect vowels and find weight of input1
     * if input2 is 1 we have to consider all the alphabets of input1
     * exinput1=wipro
     * input2=0
     * sum=23+16+18=57
     * input1=wipro
     * input2=1
     * sum=23+9+16+18+15=81
     * 
     */
    static int sumOfDig(String str, int i) {
        int sum = 0;
        char[] ch = str.toCharArray();
        String vov = "aeiou";
        String abc = " abcdefghijklmnopqrstuvwxyz";
        if (i == 0) {
            for (int j = 0; j < str.length(); j++) {
                if (ch[j] != vov.indexOf(ch[j]))
                    sum = sum + (abc.indexOf(ch[j]));
            }
        }
        if (i == 1) {
            for (int j = 0; j < str.length(); j++) {
                sum = sum + (abc.indexOf(ch[j]));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int sum = sumOfDig("wipro", 1);
        System.out.println(sum);
        // String b = "bablesh";
        // char[] ch = b.toCharArray();
        // for (int i = 0; i < b.length(); i++) {
        // System.out.print(b.indexOf(ch[i])+" ");
        // }
    }
}
