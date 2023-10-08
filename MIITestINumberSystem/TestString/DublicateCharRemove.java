package MIITestINumberSystem.TestString;

public class DublicateCharRemove {
    public static void main(String[] args) {
        String str = "AAPLEP";
        // Output : APLE // remove dublicate char from string
        String st = removeDublicat(str);
        System.out.println(st);
    }

    private static String removeDublicat(String str) {
        boolean[] bl = new boolean[str.length()];
        char[] ar = str.toCharArray();
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            if (bl[i] == false) {
                for (int j = i + 1; j < ar.length; j++) {
                    if (ar[i] == ar[j]) {
                        bl[j] = true;
                        count++;
                    }
                }
            }
        }
        char[] br = new char[ar.length - count];
        int j = 0;
        for (int i = 0; i < ar.length; i++) {
            if (bl[i] == false)
                br[j++] = ar[i];
        }
        String s = new String(br);
        return s;
    }
}
