class Solution {
    public int smallestIndex(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<10)
            {
                if(nums[i]==i)
                  return i;
            }
            else
            {
                int j=nums[i];
                int sum=0;
                while(j!=0)
                {
                    int r=j%10;
                    sum +=r;
                    j=j/10;

                }
                if(sum==i)
                  return i;
            }
        }
            return -1;
        
    }
}