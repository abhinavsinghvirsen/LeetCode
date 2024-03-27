class Solution {
    public void rotate(int[] nums, int k) {
  
        int n = nums.length;
        k = k % n;  

        rev(nums,0,n-1);
         rev(nums,0,k-1);
          rev(nums,k,n-1);

    }

    public static void rev(int[] nums, int start, int end) {
       while(start<end){
      int c= nums[start];
      nums[start]=nums[end];
      nums[end]=c;
      start++;
      end--;



       }
    }
}