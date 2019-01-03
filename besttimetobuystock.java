class Solution {
    public int maxProfit(int[] prices) {
        int maxcurrent = 0, maxsofar = 0;
        for(int i = 1 ;i<prices.length;i++ )
        {
            maxcurrent = Math.max(0, maxcurrent+=prices[i]-prices[i-1]);
            maxsofar = Math.max(maxsofar,maxcurrent);
        }
        return maxsofar;
    }
}

/01/03
