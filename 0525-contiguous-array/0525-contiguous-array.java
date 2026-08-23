class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer>hm=new HashMap<>();
        int [] prefix=new int[nums.length+1];
        prefix[0]=0;
        int k=0;
        int sum=0;
        int max=Integer.MIN_VALUE;
        hm.put(0,-1);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                sum -=1;
            }
            else
            {
                sum +=1;
            }
            if(hm.containsKey(sum))
            {
                int g=hm.get(sum);
                max=Math.max(Math.abs(i-g),max);
            }
            else
            hm.put(sum,i);

        }
        return max==Integer.MIN_VALUE?0:max;
    }
}