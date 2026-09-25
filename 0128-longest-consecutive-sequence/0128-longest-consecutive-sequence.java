class Solution {
    public int longestConsecutive(int[] nums) {
      Arrays.sort(nums);
      int count=0;
      int max=Integer.MIN_VALUE;
      if(nums.length==0)
         return 0;
      for(int i=0;i<nums.length-1;i++)
      {
        int val=nums[i];
        if(val==nums[i+1])
          continue;
        else if(val+1==nums[i+1])
           count++;
           else
        {
        max=Math.max(count,max);
        count=0;
        }

      }  
       max=Math.max(count,max);
      return max+1;
    }
}