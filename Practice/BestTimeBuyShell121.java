package Practice;

public class BestTimeBuyShell121 {
    public static int maxProfit(int[] prices) {
        int sell = 0, temp = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (sell <= (prices[j] - prices[i]))
                    sell = prices[j] - prices[i];
                if (sell >= temp)
                    temp = sell;
            }
            // if (sell >= temp) {
            // temp = sell;
            // }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 1, 5, 3, 6, 4 };
        int a = maxProfit(arr);
        System.out.println(a);
    }
}

/**
 * Example 1:
 * 
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit =
 * 6-1 = 5.
 * Note that buying on day 2 and selling on day 1 is not allowed because you
 * must buy before you sell.
 * Example 2:
 * 
 * Input: prices = [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transactions are done and the max profit = 0.
 */
