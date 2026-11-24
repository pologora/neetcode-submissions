

class Solution {
    public boolean hasDuplicate(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            
            for(int j = i + 1; j < nums.length; j++){
                int num2 = nums[j];
                if(num == num2){
                    return true;
                }
            }
        }

        return false;
    }
}
