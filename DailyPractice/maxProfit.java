class Solution {
            public int maxProfit(int[] prices) {
     int currentProfit =0, maxProfit= 0;
        for(int i=1; i<prices.length;i++)
        {
            currentProfit = Math.max(0,prices[i]-prices[i-1]);
              maxProfit = Math.max(maxProfit,currentProfit+maxProfit);
        }
        return maxProfit;
    }
    
}

Buy and Sell Stock II
