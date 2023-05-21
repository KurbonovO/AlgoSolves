package Easy;

public class BestTimeToBuyAndSellStock {

  public int bestTimeToBuyAndSellStockBruteForce(int[] prices) {

    int maxProfit = 0;

    for (int i = 0; i < prices.length - 1; i++) {
      for (int a = i + 1; a < prices.length; a++) {

        int profit = prices[a] - prices[i];
        if (profit > maxProfit) {
          maxProfit = profit;
        }
      }
    }
    return maxProfit;
  }

  public int bestTimeToBuyAndSellStockOnePass(int prices[]) {
    int minprice = Integer.MAX_VALUE;
    int maxprofit = 0;
    for (int i = 0; i < prices.length; i++) {
      if (prices[i] < minprice) {
        minprice = prices[i];
      } else if (prices[i] - minprice > maxprofit) {
        maxprofit = prices[i] - minprice;
      }
    }
    return maxprofit;
  }

  public static void main(String[] args) {

    BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();

    int prices[] = {7, 1, 5, 3, 6, 4};

    System.out.println(bestTimeToBuyAndSellStock.bestTimeToBuyAndSellStockBruteForce(prices));
    System.out.println(bestTimeToBuyAndSellStock.bestTimeToBuyAndSellStockOnePass(prices));
  }

}
