class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buyPrice = Integer.MAX_VALUE;
        int max_Profit = 0;
        for(int i = 0; i<n; i++){
            if(buyPrice<prices[i]){
                int profit = prices[i] - buyPrice;
                max_Profit = Math.max(max_Profit, profit);
            }
            else{
                buyPrice = prices[i];
            }
        }
        return max_Profit;
    }
}