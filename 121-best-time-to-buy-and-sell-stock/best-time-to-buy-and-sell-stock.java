class Solution {
    public int maxProfit(int[] prices) {

        if (prices == null || prices.length == 0) {
            return 0;  // If the array is empty or null, no profit can be made
        }
        
        int minPrice = Integer.MAX_VALUE;  // Initialize minPrice to a very large value
        int maxProfit = 0;  // Initialize maxProfit to 0
        
        // Loop through each price
        for (int i = 0; i < prices.length; i++) {
            // If we find a lower price, update minPrice
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } 
            // Calculate the profit if we were to sell today
            else {
                int profit = prices[i] - minPrice;
                // Update maxProfit if the current profit is greater
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        
        return maxProfit; 

        // int l = prices.length;
        // int profit = 0;

        // for(int i=0;i<l;i++){
        //     for(int j=i+1;j<l;j++){
        //         if(prices[i]>=prices[j]){
        //             break;
        //         }//if break
        //         if(prices[j]-prices[i]>profit){
        //             profit = prices[j]-prices[i];
        //         }//if
        //     }// for j
        // }// for i
        // return profit;
    }
}