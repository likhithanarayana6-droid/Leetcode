class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        int i=1;
      while(i>0)
        {
            int g=k*i;
            if(!set.contains(g))
               return g;
            i++;
        }
    
    return -1;
    }
}