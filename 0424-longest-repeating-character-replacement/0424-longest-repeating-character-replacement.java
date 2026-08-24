class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer>hm=new HashMap<>();
      int max=Integer.MIN_VALUE;
      int left=0;
      int maxlen=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            max=Math.max(max,hm.getOrDefault(ch,0));
           if(((i-left+1)-max)<=k)
           {
            maxlen=Math.max(maxlen,i-left+1);
           }
           while(((i-left+1)-max)>k)
           {
            if(hm.get(s.charAt(left))>1)
            {
                hm.put(s.charAt(left),hm.get(s.charAt(left))-1);
            }
            else
             hm.remove(s.charAt(left));

             for(char u:hm.keySet())
             {
                max=Math.max(max,hm.get(u));
             }
             left++;
           }
        }
           return maxlen;
        
    }
}