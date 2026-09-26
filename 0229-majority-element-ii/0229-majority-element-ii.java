class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>a=new ArrayList<>();
        Map<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);

        }
        int n=nums.length;
        for(int k:hm.keySet())
        {
            int val=hm.get(k);
            int u=n/3;
            if(val>u)
               a.add(k);
        }
        return a;
    }
}