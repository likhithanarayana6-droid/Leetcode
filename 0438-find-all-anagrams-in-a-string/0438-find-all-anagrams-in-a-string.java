class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>b=new ArrayList<>();
        int k=p.length();
        char[] d=p.toCharArray();
        Arrays.sort(d);
        for(int i=0;i<=s.length()-k;i++)
        {
            String a=s.substring(i,i+k);
            char[] e=a.toCharArray();
            Arrays.sort(e);
            if(Arrays.equals(e,d))
            b.add(i);
        }
        return b;
    }
}