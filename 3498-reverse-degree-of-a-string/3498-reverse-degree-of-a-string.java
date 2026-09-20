class Solution {
    public int reverseDegree(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int val=26-(ch-'a');
            int j=i+1;
            ans +=val*j;
        }
        return ans;
    }
}