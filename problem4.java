
public class problem4 {

    public static int maxProfit(int[] prices) {

        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {

            for (int j = i + 1; j < prices.length; j++) {

                int profit = prices[j] - prices[i];

                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int[] prices = { 8, 2, 5, 1, 7, 9 };

        int result = maxProfit(prices);

        System.out.println("Maximum Profit: " + result);
    }
}
