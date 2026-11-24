class Solution {
    public int characterReplacement(String s, int k) {
        if(s == null || s.length() < 1){
            return 0;
        }
        int result = 0;
        char[] chars = s.toCharArray();
        int startCode = (int) 'A';
        int[] frequency = new int[26]; 

        int start = 0;
        int end = 0;
        while(end < chars.length){
            int charCodeEnd = (int) chars[end] - startCode;
            int charCodeStart = (int) chars[start] - startCode;
            frequency[charCodeEnd]++;
            int mostFrequencyCount = 0;
            int windowLength = end - start + 1;

            for(int freq : frequency){
                mostFrequencyCount = Math.max(mostFrequencyCount, freq);
            }

            if(windowLength - mostFrequencyCount <= k){
                result = Math.max(result, windowLength);
                end++;
            }else {
                frequency[charCodeStart]--;
                frequency[charCodeEnd]--;
                start++;
            }

        }

        return result;

    }
}
