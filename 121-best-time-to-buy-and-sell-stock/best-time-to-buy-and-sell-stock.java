class Solution {
    public int maxProfit(int[] prices) {
        int l = prices.length;
        int profit = 0;

        for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                if(prices[i]>=prices[j]){
                    break;
                }//if break
                if(prices[j]-prices[i]>profit){
                    profit = prices[j]-prices[i];
                }//if
            }// for j
        }// for i
        return profit;
    }
}