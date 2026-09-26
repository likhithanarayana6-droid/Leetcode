class Solution {
    public int maxProduct(int[] nums) {
        int maxprod=nums[0];
        int min=nums[0];
        int ans=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                int temp=maxprod;
                maxprod=min;
                min=temp;
            }
            maxprod=Math.max(nums[i],nums[i]*maxprod);
            min=Math.min(nums[i],nums[i]*min);
            ans=Math.max(ans,maxprod);
        }
        return ans;
    }
}