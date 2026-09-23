class Solution {
    public int maxProfit(int[] prices) {
        
        int n=prices.length;
        int maxpft=0;
        int minpr=prices[0];

        for(int i=1;i<n;i++)
        {
            if(prices[i]<minpr)
            {
                minpr=prices[i];
            }
            else{

                maxpft=Math.max(maxpft,prices[i]-minpr);
            }
        }
        return maxpft;

    }
}