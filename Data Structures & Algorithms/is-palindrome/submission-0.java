class Solution {
    public boolean isPalindrome(String s) {
        String[] chars = s.split("");

        int start = 0;
        int end = chars.length - 1;

        while(start < end){
            while(!chars[start].matches("[a-zA-Z0-9]") && start < end){
                start++;
            }

            while(!chars[end].matches("[a-zA-Z0-9]") && start < end){
                end--;
            }

            String firstChar = chars[start];
            String secondChar = chars[end];

        System.out.println(firstChar + "----"+ secondChar);

            if(!firstChar.equalsIgnoreCase(secondChar)){
                return false;
            }

            start++;
            end--;
        }

        

        return true;
    }
}
