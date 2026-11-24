class Solution {
    public int maxArea(int[] heights) {
        int max = 0;

       int start = 0;
       int end = heights.length - 1;

       while(start < end){
            int heightsStart = heights[start];
            int heightsEnd = heights[end];
            int minHeight = Math.min(heightsStart,heightsEnd);
            int length = end - start;
            int amount = length * minHeight;

            max = Math.max(max, amount);

            if(heightsStart < heightsEnd){
                start++;
            }else {
                end--;
            }
       }

       return max;
    }
}
