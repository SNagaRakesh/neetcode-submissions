class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        int profit = 0;
        int differece = 0;

        int low = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {
            if(prices[i] < low) low = prices[i];

            differece = prices[i] - low;

            profit = Math.max(profit, differece);
        }
        return profit;
    }
}
