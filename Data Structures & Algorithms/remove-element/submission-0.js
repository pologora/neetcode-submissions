class Solution {
    /**
     * @param {number[]} nums
     * @param {number} val
     * @return {number}
     */
    removeElement(nums, val) {
        let left = 0;
        for(let i = 0; i< nums.length; i++){
            const num = nums[i];

            if(num !== val){
                nums[left] = num;
                left++;
            }
        }

        return left;
    }
}
