class Solution {
    public int[] twoSum(int[] numbers, int target) {
         int left = 0;
        int right = numbers.length - 1;
        
        while (left < right) {
            int currentSum = numbers[left] + numbers[right];
            
            if (currentSum == target) {
                return new int[]{left + 1, right + 1}; // Adding 1 to indices to convert from 0-indexed to 1-indexed
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }
        
        
        return new int[]{};
    }
}