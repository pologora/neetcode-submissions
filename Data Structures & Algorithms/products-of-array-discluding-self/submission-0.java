class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int [] prefixes = new int[length];
        int [] postfixes = new int[length];
        int [] result = new int[length];

        
        for(int i = 0; i < length; i++){
            prefixes[i] = (i == 0 ? (1 * nums[i]) : (prefixes[i - 1] * nums[i]));    
        }

        for(int i = length - 1; i >= 0; i--){
            postfixes[i] = (i == length - 1 ? (1 * nums[i]) : (postfixes[i + 1] * nums[i]));
        }

        for(int i = 0; i < length; i++){
            int prefix = i == 0 ? 1 : prefixes[i - 1];
            int postfix = i == length - 1 ? 1 : postfixes[i + 1];

            result[i] = prefix * postfix;
        }

     

        return result;
    }
}  
