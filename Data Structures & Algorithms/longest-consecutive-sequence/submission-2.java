class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int maxConsecutive = 1;
       HashSet<Integer> set = new HashSet<>();

       for(int num : nums){
        set.add(num);
       }

       for(int num : nums){
        int consecutives = 1;
            if(set.contains(num - 1)){
                continue;
            }

            while(set.contains(num + 1)){
                consecutives++;
                num++;
            }

            maxConsecutive = Math.max(consecutives, maxConsecutive);
       }

       return maxConsecutive;
    }
}
