class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap();
        List<Integer>[] backet = new ArrayList[nums.length + 1];
        int[] result = new int[k];

        for(int i = 0; i < backet.length; i++){
            backet[i] = new ArrayList<>();
        }

        for(int num : nums){
            if(!map.containsKey(num)){
                map.put(num, 0);
            }

           map.put(num, map.get(num) + 1);
        }

        map.forEach((key, value) -> {
            backet[value].add(key);
        });

        System.out.println(Arrays.toString(backet));

        for(int i = backet.length - 1; i > 0; i--){
            for(int j = 0; j < backet[i].size(); j++){
                int num = backet[i].get(j);
                result[--k] = num;

                if (k <= 0) {
                    return result;
                }
            }
        }

        return new int[]{};
    }

  
}
