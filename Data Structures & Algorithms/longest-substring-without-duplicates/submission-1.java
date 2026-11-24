class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() < 1){
            return 0;
        }
        char[] charsArray = s.toCharArray();
        int result = 1;

        for(int i = 0; i < charsArray.length; i++){
            HashSet<Character> charsSet = new HashSet<>();
            char startChar = charsArray[i];
            charsSet.add(startChar);

            for(int j = i + 1; j < charsArray.length; j++){
                char char2 = charsArray[j];
                if(!charsSet.contains(char2)){
                    charsSet.add(char2);
                    result = Math.max(result, charsSet.size());
                }else {
                    break;
                }
            }

        }

        return result;
    }
}
