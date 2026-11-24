class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    findMaxConsecutiveOnes(nums) {
        let max = 0;
        let currentMax = 0;

        for(let i = 0; i < nums.length; i++){
            const num = nums[i];
            if(num === 1){
                currentMax++;
            } else {
                max = Math.max(max,currentMax);
                currentMax = 0;
            }
        }
   
        return  Math.max(max,currentMax);
    }
}
