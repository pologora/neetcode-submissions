class Solution {
    public int characterReplacement(String s, int k) {
        if(s == null || s.length() < 1){
            return 0;
        }
        int result = 0;
        int maxLength = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();

        int start = 0;
        for(int i = 0; i < chars.length; i++){
            char ch = chars[i];
            map.put(ch, (map.get(ch) == null ? 0 : map.get(ch)) + 1);
            maxLength = Math.max(maxLength, map.get(ch));

            while((i - start + 1) - maxLength > k){
                char ch2 = chars[start];
                map.put(ch2, (map.get(ch2)) - 1);
                start++;
            }

            result = Math.max(result, i - start + 1);
        }
        

        return result;
        }

}
