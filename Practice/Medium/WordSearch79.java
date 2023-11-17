package Practice.Medium;

import java.util.Arrays;

public class WordSearch79 {
    public static boolean exist(char[][] board, String word) {
        if (word.length() == 1 && board.length == 1)
            return true;
        int[] ch = new int[26];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                ch[board[i][j] - 65]++;
            }
        }
        int[] c = new int[26];
        char[] temp = word.toCharArray();
        for (int i = 0; i < temp.length; i++) {
            c[temp[i] - 65]++;
        }
        System.out.println(Arrays.toString(ch));
        System.out.println(Arrays.toString(c));
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (ch[i] >= c[i] && c[i] != 0 && ch[i] != 0)
                count += c[i];
        }
        System.out.println(count);
        if (count == temp.length)
            return true;
        return false;
    }

    public static void main(String[] args) {
        char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
        String word = "ABCCEDZ";
        boolean bl = exist(board, word);
        System.out.println(bl);
    }
}

/*
 * Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word
 * = "ABCCED"
 * Output: true
 * 
 * Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word
 * = "SEE"
 * Output: true
 * 
 * Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word
 * = "ABCB"
 * Output: false
 * 
 */