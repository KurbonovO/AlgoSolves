package Easy;

import org.jetbrains.annotations.NotNull;

public class BestTimeToBuyAndSellStock {

    public int bruteForce(int[] prices) {

        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            for (int a = i + 1; a < prices.length; a++) {
                int profit = prices[i] - prices[a];
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}
