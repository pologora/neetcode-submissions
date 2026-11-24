class Solution {
    public int trap(int[] height) {
        if(height == null || height.length < 3){
            return 0;
        }

        int sum = 0;

        int[] leftMaxHeight = new int[height.length];
        int[] rightMaxHeight = new int[height.length];

        int currentMax = 0;
        for(int i = 0; i < leftMaxHeight.length; i++){
            leftMaxHeight[i] = currentMax;

            currentMax = Math.max(currentMax, height[i]);
        }

        currentMax = 0;
        for(int i = rightMaxHeight.length - 1; i >= 0 ; i--){
            rightMaxHeight[i] = currentMax;

            currentMax = Math.max(currentMax, height[i]);
        }

       
       
        for(int i = 0; i < height.length; i++){
            int water = Math.min(leftMaxHeight[i], rightMaxHeight[i]) - height[i];
            if(water > 0){
                sum += water;
            }
        }

        return sum;
    }
}
