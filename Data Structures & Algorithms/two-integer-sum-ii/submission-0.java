class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int firstPointer = 0;
        int secondPointer = numbers.length - 1; 

        while(firstPointer < secondPointer){
            int num1 = numbers[firstPointer];
            int num2 = numbers[secondPointer];

            int sum = num1 + num2;
            if (sum == target){
                return new int[] {firstPointer + 1, secondPointer + 1};
            }

            if(sum > target){
                secondPointer--;
            }else {
                firstPointer++;
            }
           
        }

        return new int [1];

    }
}
