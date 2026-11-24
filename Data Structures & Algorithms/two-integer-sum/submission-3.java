class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int secondNum = target - num;

            if(map.get(secondNum) != null){
                return new int[] { map.get(secondNum), i };
            } 

            map.put(num, i);
        }

        return new int[2];
    }
}
