class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

      if(nums == null || nums.length < 3){
        return result;
      }

      Arrays.sort(nums);
      
 
        for(int i = 0; i < nums.length - 2; i++){
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }

            int start = i + 1;
            int end = nums.length - 1;
            int num1 = nums[i];

            while(start < end){
                int num2 = nums[start];
                int num3 = nums[end];
                int sum = num1 + num2 + num3;

                if(sum == 0){
                   result.add(Arrays.asList(num1,num2,num3));
                   
                   start++;
                   end--;

                   while(start < end && nums[end] == nums[end + 1]){
                    end--;
                   }

                   while(start < end && nums[start] == nums[start - 1]){
                    start++;
                   }
                   
                }else if(sum > 0){
                    end--;
                }else {
                    start++;
                }
            }

        }
        return result;
    }
}
