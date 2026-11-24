class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int secondNum = target - num;

            if(map.containsKey(secondNum)){
                return new int[] { map.get(secondNum), i };
            } 

            map.put(num, i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}
