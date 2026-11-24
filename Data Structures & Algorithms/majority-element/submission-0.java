class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int result = 0;

        for(int num:nums){
            if(count == 0){
                result = num;
                count++;
            }else {
                if(result == num){
                    count++;
                }else {
                    count--;
                }
            }
        }

        return result;
    }
}