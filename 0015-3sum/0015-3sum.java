class Solution {
    public int ispair(int[]nums,int p1,int p2,int target)
    {
       int low=p1;
       int high=p2;
       while(low<=high)
       {
        int mid=(low+high)/2;
        if(nums[mid]==target)
        {
            return mid;
        }
        else if(nums[mid]<target)
        {
            low=mid+1;
        }
        else
        {
            high=mid-1;
        }
       }
       return -1;
    }
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        
        Set<List<Integer>>w=new HashSet<>();
      
       for(int i=0;i<nums.length-2;i++)
       {
        for(int j=i+1;j<nums.length-1;j++)
        {
        int a=nums[i];
        int b=nums[j];
        int c=0-(a+b);
        List<Integer>f=new ArrayList<>();
        int u=ispair(nums,j+1,nums.length-1,c);
         if(u>=0)
         {
           f.add(a);
           f.add(b);
           f.add(c);
            w.add(f);
         }
        
       }
       }

      return new ArrayList<>(w);
    }
}