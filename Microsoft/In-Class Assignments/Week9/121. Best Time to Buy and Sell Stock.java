class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int maxProfit=0,sell=0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]>buy)
            {
                sell=prices[i];
                maxProfit=max(maxProfit,sell-buy);
            }
            else
            {
                buy=prices[i];
            }
        }
        return maxProfit;
    }
    public int max(int a,int b)
    {
        int M=a>b ? a : b;
        return M;
    }
}
