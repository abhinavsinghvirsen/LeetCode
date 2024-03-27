class Solution {
    public int majorityElement(int[] nums) {
         // Initialize variables for the majority element and its count
        int majorityElement = 0;
        int count = 0;
        
        // Iterate through the array
        for (int num : nums) {
            // If count is zero, set the current element as the potential majority element
            if (count == 0) {
                majorityElement = num;
            }
            
            // If the current element is equal to the potential majority element, increment count
            if (num == majorityElement) {
                count++;
            } else {
                // Otherwise, decrement count
                count--;
            }
        }
        
        // At the end, majorityElement will hold the majority element
        return majorityElement;
}

    }

