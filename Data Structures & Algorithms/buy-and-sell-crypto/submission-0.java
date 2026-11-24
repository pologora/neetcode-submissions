class Solution {
    public int maxProfit(int[] prices) {
       int max = 0;
        int current = prices[0];

       for(int i = 1; i < prices.length; i++){
        max = Math.max(max, prices[i] - current);

        if(prices[i] < current){
            current = prices[i];
        }
       } 

       return max;
    }
}
