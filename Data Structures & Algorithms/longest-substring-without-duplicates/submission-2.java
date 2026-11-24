class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() < 1){
            return 0;
        }

        int result = 1;
        
        int l = 0;
        int r = 1;

        char [] ch = s.toCharArray();
        HashSet<Character> set = new HashSet<>();
        set.add(ch[l]);

        while(r < ch.length){
            char chR = ch[r];
            if(!set.contains(chR)){
                set.add(chR);
                result = Math.max(result, set.size());
            } else {
                while(set.contains(chR)){
                    char chL = ch[l];
                    set.remove(chL);
                    l++;
                }

                set.add(chR);
            }

            r++;
        }

        return result;
    }
}
// z x y x