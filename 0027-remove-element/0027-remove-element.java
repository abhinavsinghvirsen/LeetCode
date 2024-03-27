class Solution {
    public int removeElement(int[] nums, int val) {
       int k = 0; // Initialize the count of elements not equal to val
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] != val) {
            nums[k] = nums[i]; // Copy non-val elements to the front
            k++; // Increment k to mark the position for the next non-val element
        }
    }
    return k; // Return the count of elements not equal to val
    }
}