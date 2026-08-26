class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int left=0;
        String min="";
        Map<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
           char ch=s.charAt(i);
           if(ch=='1')
              hm.put(ch,hm.getOrDefault(ch,0)+1);
           
            while(hm.getOrDefault('1',0)>k)
            {
                char ch1=s.charAt(left);
                if(ch1=='1')
                   {
                    hm.put('1',hm.get('1')-1);
                   
                   }
                
                   left++;
            }
            while(left<i&&s.charAt(left)=='0')
               left++;
             if(hm.getOrDefault('1',0)==k)
            {
                String curr=s.substring(left,i+1);
                if(min.equals("")||curr.length()<min.length()||(curr.length()==min.length()&&curr.compareTo(min)<0))
                  min=curr;
            }
           
        }
        return min;
    }
}