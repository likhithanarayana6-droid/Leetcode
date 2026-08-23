class Solution {
    public int maximumLengthSubstring(String s) {
        int left=0;
        int max=Integer.MIN_VALUE;
        Map<Character,Integer>hm=new HashMap<>();
        for(int right=0;right<s.length();right++)
        {
              Character ch=s.charAt(right);
              hm.put(ch,hm.getOrDefault(ch,0)+1);
              while(hm.get(ch)>2)
              {
               Character ch1=s.charAt(left);
                hm.put(ch1,hm.get(ch1)-1);
                left++;
              }
              max=Math.max(max,right-left+1);
        }
        return max;
    }
}