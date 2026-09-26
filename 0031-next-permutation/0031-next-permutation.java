class Solution {
    public void nextPermutation(int[] nums) {
        int pivot=-1;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]<nums[i+1])
            {
               pivot=i;
            }       
        }
    
    int val=0;
    if(pivot>=0)
    {
    for(int i=nums.length-1;i>=0;i--)
    {
        if(nums[i]>nums[pivot])
        {
            int temp=nums[i];
            nums[i]=nums[pivot];
            nums[pivot]=temp;
             val=i+1;
            break;
        }
    }
    }
    int left=pivot+1;
    int right=nums.length-1;
    while(left<right)
    {
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
        left++;
        right--;
    }
    
        
    }
}