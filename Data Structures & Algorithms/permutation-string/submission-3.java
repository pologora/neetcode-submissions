class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1==null || s2==null ||s1.length() > s2.length()){
            return false;
        }

        int matches = 0;
        int startCode = (int) 'a';
        
        char[] charsS1 = s1.toCharArray();
        char[] charsS2 = s2.toCharArray();

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for(int i = 0; i < charsS1.length; i++){
            int index1 = (int) charsS1[i] - startCode;
            int index2 = (int) charsS2[i] - startCode;

            count1[index1]++;
            count2[index2]++;
        }

        for(int i = 0; i < 26; i++){
            if(count1[i] == count2[i]){
                matches++;
            }
        }

        int l = 0;
        int r = charsS1.length;

        while(r < charsS2.length){
            if(matches == 26){
                return true;
            }

            int indexL = (int) charsS2[l] - startCode;
            int indexR = (int) charsS2[r] - startCode;

            if(count1[indexR] == count2[indexR]){
                matches--;
            } 

            count2[indexR]++;
            if(count1[indexR] == count2[indexR]){
                 matches++;
            }
            

            if(count1[indexL] == count2[indexL]){
                matches--;
            } 

            count2[indexL]--;
            if(count1[indexL] == count2[indexL]){
                 matches++;
            }
            

            l++;
            r++;
        }

        return matches == 26;
    }

   
}
