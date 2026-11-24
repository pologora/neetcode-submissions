class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        HashSet<String> set = new HashSet<>();

        if(nums == null || nums.length < 3){
            return result;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++ ){
            for(int j = i + 1; j < nums.length; j++){
                for(int s = j + 1; s < nums.length; s++){
                    int num1 = nums[i];
                    int num2 = nums[j];
                    int num3 = nums[s];

                    if((num1 + num2 + num3) == 0){
                        List<Integer> list = new ArrayList<>();
                        list.add(num1);
                        list.add(num2);
                        list.add(num3);

                        int[] arr = new int[]{num1,num2,num3};
                        Arrays.sort(arr);
                        String triplet = Arrays.toString(arr);

                        if(!set.contains(triplet)){
                            set.add(triplet);
                            result.add(list);
                        }
                       
                    }
                }
            }
        }

        return result;
    }
}
