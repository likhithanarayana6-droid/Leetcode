class Solution {
    public int longestOnes(int[] nums, int k) {
        Map<Integer,Integer>hm=new HashMap<>();
        int left=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
             int g=nums[i];
             if(g==0)
             {
                hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
             }
             while(hm.getOrDefault(0,0)>k)
             {
                if(nums[left]==0)
                {
                   hm.put(nums[left],hm.getOrDefault(nums[left],0)-1);

                   if(hm.get(nums[left])==0)
                        hm.remove(nums[left]);
                }
                left++;
             }
             max=Math.max(max,i-left+1);
        }
        return max;
    }
}