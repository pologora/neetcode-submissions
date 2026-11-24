class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);

        int currentConsecutive = 1;
        int maxConsecutive = 1;
        for(int i = 1; i < nums.length; i++){
            int currentNum = nums[i];
            int prevNum = nums[i-1];

            if((currentNum - 1) == prevNum){
                currentConsecutive++;
                System.out.println(currentConsecutive);
            }else if(currentNum == prevNum){
                continue;
            } else{
                maxConsecutive = Math.max(currentConsecutive, maxConsecutive);
                currentConsecutive = 1;
            }

            System.out.println(Arrays.toString(nums));
        }

        return Math.max(maxConsecutive, currentConsecutive);
    }
}
