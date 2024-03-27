class Solution {
    public int removeDuplicates(int[] nums) {
         if (nums.length == 0) return 0; // Edge case: empty array
    
    int y = 1; // Initialize the count of unique elements
    for (int x = 1; x < nums.length; x++) {
        if (nums[x] != nums[x - 1]) {
            nums[y] = nums[x]; // Copy unique elements to the front
            y++;
        }
    }
    return y; // Return the count of unique elements
    }
}