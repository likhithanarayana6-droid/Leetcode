class Solution {
    public int thirdMax(int[] nums) {
       int max=Integer.MIN_VALUE;
       TreeSet<Integer>set=new TreeSet<>(Collections.reverseOrder());
       for(int i=0;i<nums.length;i++)
       {
          set.add(nums[i]);
       }
       List<Integer>k=new ArrayList<>(set);
       if(k.size()<3)
       {
        return  k.get(0);
       }
      return k.get(2);
    }
}