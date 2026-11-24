class Solution {
    public int maxProfit(int[] prices) {
    //    int max = 0;
    //     int current = prices[0];

    //    for(int i = 1; i < prices.length; i++){
    //     max = Math.max(max, prices[i] - current);

    //     if(prices[i] < current){
    //         current = prices[i];
    //     }
    //    } 

    //    return max;

        int l = 0;
        int r = 1;
        int max = 0;
        while(r < prices.length){
            int buy = prices[l];
            int sell = prices[r];
            int profit = sell - buy;

            max = Math.max(max, profit);

            if(sell < buy){
                l = r;
            }

            r++;
        }

        return max;
    }
}
