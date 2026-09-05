class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] lm=new int[nums.length];
        int[] rm=new int[nums.length];
        lm[0]=nums[0];
        rm[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<nums.length;i++)
        {
            lm[i]=Math.max(nums[i],lm[i-1]);
        }
        for(int i=nums.length-2;i>=0;i--)
        {
            rm[i]=Math.min(nums[i],rm[i+1]);
        }
        for(int i=0;i<nums.length;i++)
        {
            int g=lm[i]-rm[i];
            if(g<=k)
              return i;
        }
        return -1;
    }
}