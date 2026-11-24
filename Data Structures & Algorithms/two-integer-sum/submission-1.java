
class Solution {
    public int[] twoSum(int[] nums, int target) {
       int[] result = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap();

        for(int i = 0; i < nums.length; i++){
            int needValue = target - nums[i];
           Integer index =  hashMap.get(needValue);

           if(index != null){
            return new int[]{index, i};
           }

           hashMap.put(nums[i], i);     
        }

       return result;
    }
}