package leetcode;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
 */
public final class Problem121BestTimeToBuyAndSellStock {
    // Time - O(N), Space - O(1)
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int mininum = prices[0];
        int maxProfit = 0;

        for (int currentPrice : prices) {
            mininum = Math.min(mininum, currentPrice);
            maxProfit = Math.max(maxProfit, currentPrice - mininum);
        }

        return maxProfit;
    }
}
