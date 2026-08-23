class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
       int i=0;
       int max=0;
       while(i<nums.length)
       {
        if(nums[i]>threshold||nums[i]%2!=0)
        {
            i++;
            continue;
        }
        int j=i+1;
        while(j<nums.length&&nums[j]<=threshold&&(nums[j]%2!=nums[j-1]%2))
        {
            j++;
        }
        max=Math.max(max,j-i);
        i++;
       }
       return max;
    }
}